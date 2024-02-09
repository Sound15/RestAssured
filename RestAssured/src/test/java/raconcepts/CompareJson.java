package raconcepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;





public class CompareJson {
	
	static String json1="{\r\n"
			+ "    \"firstName\":\"Agni\",\r\n"
			+ "    \"lastName\":\"A\",\r\n"
			+ "    \"email\":\"Agni@agni.com\",\r\n"
			+ "    \"skills\":[\"java\",\"selenium\"]\r\n"
			+ "}";
	static String json2="{\r\n"
			+ "    \"firstName\":\"Agni\",\r\n"
			+ "    \"lastName\":\"A\",\r\n"
			+ "    \"skills\":[\"selenium\",\"java\"],\r\n"
			+ "    \"email\":\"Agni@agni.com\"\r\n"
			+ "}";

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		JsonNode jsonNode1=mapper.readTree(json1);
		JsonNode jsonNode2=mapper.readTree(json2);
		System.out.println(jsonNode1.equals(jsonNode2));

	}

}
