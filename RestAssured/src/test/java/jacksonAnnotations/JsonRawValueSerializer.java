package jacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValueSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		JsonRawValuePOJO rawvaluepojo=new JsonRawValuePOJO();
		rawvaluepojo.setId(3);
		rawvaluepojo.setName("Agni");
		rawvaluepojo.setEmail("agni@agni.com");
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rawvaluepojo);
		System.out.println(json);

	}

}
