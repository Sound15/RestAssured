package jacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValueSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		JsonValuePOJO valuepojo=new JsonValuePOJO();
		valuepojo.setId(3);
		valuepojo.setName("Agni");
		valuepojo.setEmail("agni@agni.com");
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(valuepojo);
		System.out.println(json);

	}

}
