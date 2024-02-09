package raconcepts;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class JsonPathConfiguration {

	public static void main(String[] args) {
		String json="[\r\n"
				+ "    {\r\n"
				+ "        \"name\":\"john\",\r\n"
				+ "        \"gender\":\"male\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "        \"name\":\"ben\"\r\n"
				+ "    }\r\n"
				+ "]";
//		Configuration configuration=Configuration.defaultConfiguration();
//		configuration=configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		//if the type of configuration is known
//		Configuration configuration=Configuration.builder().options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();
//		String result=JsonPath.using(configuration).parse(json).read("$.[1].gender");
//		System.out.println(result);
		
//		Configuration configuration=Configuration.defaultConfiguration();
//		configuration=configuration.addOptions(Option.ALWAYS_RETURN_LIST);
//        List<String> result=JsonPath.using(configuration).parse(json).read("$.[0].gender");
//        System.out.println(result);
		
//		Configuration configuration=Configuration.defaultConfiguration();
//		configuration=configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);
//		String result=JsonPath.using(configuration).parse(json).read("$.[1].gender");
//		System.out.println(result);
		
//		Configuration configuration=Configuration.defaultConfiguration();
//		configuration=configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
//		configuration=configuration.addOptions(Option.ALWAYS_RETURN_LIST);
//        List<String> result=JsonPath.using(configuration).parse(json).read("$.[1].gender");
//        System.out.println(result);
        
        Configuration configuration=Configuration.defaultConfiguration();
		configuration=configuration.addOptions(Option.REQUIRE_PROPERTIES);
        List<String> result=JsonPath.using(configuration).parse(json).read("$[*].gender");
        System.out.println(result);
	}

}
