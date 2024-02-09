package jsonpath;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class FluentAPIReadJson {
	
	public static void fluentAPI() throws IOException {
		File jsonfile=new File("src/test/resources/bookstore.json");
		
//		DocumentContext context=JsonPath.parse(jsonfile);
//		List<Object> priceList=JsonPath.read(jsonfile,"$..Price");
		
		Configuration configuration=Configuration.defaultConfiguration();
		List<Object> priceList=JsonPath.using(configuration).parse(jsonfile).read("$..Price");
				
		for(Object price:priceList) {
			System.out.println(price);
		}
		
	}
	
	


	public static void main(String[] args) throws IOException {
		fluentAPI();

	}

}
