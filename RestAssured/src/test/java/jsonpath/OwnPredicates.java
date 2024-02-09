package jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;
import com.jayway.jsonpath.Predicate.PredicateContext;

public class OwnPredicates {
	static File jsonfile=new File("src/test/resources/bookstore.json");
	
	public static void customPredicate() throws IOException {
//		Predicate isbn=new Predicate() {
//			
//			@Override
//			public boolean apply(PredicateContext ctx) {
//				boolean predicate=ctx.item(Map.class).containsKey("ISBN");
//				return predicate;
//			}
//		};
		//lambda expression
		Predicate isbn=ctx->ctx.item(Map.class).containsKey("ISBN");
		List<Map<String,Object>> result=JsonPath.parse(jsonfile).read("$.Books[?].ISBN",List.class,isbn);
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		customPredicate();
	}

}
