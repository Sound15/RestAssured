package jacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterDeserializer {

	public static void main(String[] args) throws JsonProcessingException {
		String json="{\r\n"
				+ "    \"name\":\"Agni\",\r\n"
				+ "    \"email\":\"Agni@agni.com\",\r\n"
				+ "    \"employeeId\":3\r\n"
				+ "}";
		ObjectMapper mapper=new ObjectMapper();
		JsonSetterPOJO pojo=mapper.readValue(json,JsonSetterPOJO.class);
		System.out.println(pojo.getId());

	}

}
