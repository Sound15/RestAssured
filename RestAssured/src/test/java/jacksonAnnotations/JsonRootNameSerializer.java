package jacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootNameSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		JsonRootNamePOJO getterpojo=new JsonRootNamePOJO();
		getterpojo.setId(3);
		getterpojo.setName("Agni");
		getterpojo.setEmail("agni@agni.com");
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(getterpojo);
		System.out.println(json);

	}

}
