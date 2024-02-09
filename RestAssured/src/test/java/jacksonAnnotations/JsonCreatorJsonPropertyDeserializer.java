package jacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreatorJsonPropertyDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String json="{\r\n"
				+ "    \"name\":\"Agni\",\r\n"
				+ "    \"email\":\"Agni@agni.com\",\r\n"
				+ "    \"employeeId\":3\r\n"
				+ "}";
		ObjectMapper mapper=new ObjectMapper();
		JsonCreatorJsonPropertyPOJO pojo=mapper.readValue(json,JsonCreatorJsonPropertyPOJO.class);
		System.out.println(pojo.getId());
		System.out.println(pojo.getName());
		System.out.println(pojo.getEmail());

	}

}
