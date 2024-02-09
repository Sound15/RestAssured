package jacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetterDeserialize {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String json="{\r\n"
				+ "    \"firstName\":\"Agni\",\r\n"
				+ "    \"lastName\":\"A\",\r\n"
				+ "    \"email\":\"Agni@agni.com\",\r\n"
				+ "    \"skills\":[\"java\",\"selenium\"]\r\n"
				+ "}";
		ObjectMapper mapper=new ObjectMapper();
		JsonAnySetterPOJO pojo=mapper.readValue(json,JsonAnySetterPOJO.class);
		System.out.println(pojo.getEmployess());

	}

}
