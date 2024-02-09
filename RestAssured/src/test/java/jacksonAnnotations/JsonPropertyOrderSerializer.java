package jacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyOrderSerializer {
	
	public static void main(String[] args) throws JsonProcessingException {
	JsonPropertyOrderPOJO propertyorderpojo=new JsonPropertyOrderPOJO();
	propertyorderpojo.setId(3);
	propertyorderpojo.setName("Agni");
	propertyorderpojo.setEmail("agni@agni.com");
	
	ObjectMapper mapper=new ObjectMapper();
	String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(propertyorderpojo);
	System.out.println(json);
	}
}
