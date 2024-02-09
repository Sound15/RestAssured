package jacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetterSerailizer {

	public static void main(String[] args) throws JsonProcessingException {
		JsonGetterPOJO getterpojo=new JsonGetterPOJO();
		getterpojo.setId(3);
		getterpojo.setName("Agni");
		getterpojo.setEmail("agni@agni.com");
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getterpojo);
		System.out.println(json);

	}

}
