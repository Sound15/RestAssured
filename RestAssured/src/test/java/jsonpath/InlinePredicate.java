package jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class InlinePredicate {
	
	public static void inlinepredicate() throws IOException {
		File jsonfile=new File("src/test/resources/bookstore.json");
		List<Object> result=JsonPath.parse(jsonfile)
				                    //.read("$.Books[?(@.Price<90)].Price");
		                            //.read("$.Books[?(@.Price>90 && @.category==\"fiction\")].Price");
				                    //.read("$.Books[?(@.Price>90 || @.category==\"fiction\")].Price");
				                    .read("$.Books[?(@.Price>90 && @.category!=\"fiction\")].Price");
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		inlinepredicate();

	}

}
