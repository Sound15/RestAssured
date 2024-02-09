package jsonpath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.InvalidJsonException;
import com.jayway.jsonpath.JsonPath;

public class ReadJson{
	public static void readjson() throws IOException {
		File jsonfile=new File("src/test/resources/bookstore.json");
		List<Object> priceList=JsonPath.read(jsonfile,"$..Price");
		for(Object price:priceList) {
			System.out.println(price);
		}
	}
	
	//parsing only one time although read function is called multiple times
	public static void parseOneTime() throws InvalidJsonException, IOException {
		FileInputStream jsonfile=new FileInputStream("src/test/resources/bookstore.json");
		Object parsedjson=Configuration.defaultConfiguration().jsonProvider().parse(jsonfile.readAllBytes());
		//List<Object> priceList=JsonPath.read(jsonfile1,"$..Price");
		List<Object> titleList=JsonPath.read(parsedjson,"$..Title");
		for(Object title:titleList) {
			System.out.println(title);
		}

		
	}
	
	public static void main(String[] args) throws IOException {
		//readjson();
		parseOneTime();

	}

}
