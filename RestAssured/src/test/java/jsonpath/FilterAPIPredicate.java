package jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

import static com.jayway.jsonpath.Criteria.where;
import static com.jayway.jsonpath.Filter.filter;
import static com.jayway.jsonpath.JsonPath.parse;


public class FilterAPIPredicate {
	static File jsonfile=new File("src/test/resources/bookstore.json");
	
	public static void firstFilter() throws IOException {
		Filter price=Filter.filter(Criteria.where("Price").lt(90));
		List<Object> result=JsonPath.parse(jsonfile).read("$.Books[?].Price",price);
		System.out.println(result);
	}

	public static void secondFilter() throws IOException {
		Filter author=Filter.filter(Criteria.where("Price").lt(90).and("category").is("fiction"));
		List<Map<String,Object>> result=JsonPath.parse(jsonfile).read("$.Books[?]",author);
		System.out.println(result.get(1).get("Authors"));
	}
	
	//on importing static packages
	public static void thirdFilter() throws IOException {
		Filter details=filter(where("Price").gt(90).and("category").is("fiction"));
		List<Map<String,Object>> result=JsonPath.parse(jsonfile).read("$.Books[?]",details);
		System.out.println(result.get(0).get("Authors"));
	}
	
	
	public static void main(String[] args) throws IOException {
		//firstFilter();
		//secondFilter();
		thirdFilter();
	}

}
