package jacksonAnnotations;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreIncludeSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		JsonIgnoreIncludePOJO pojo=new JsonIgnoreIncludePOJO();
		//pojo.setId(3);
		//pojo.setName("Agni");
		pojo.setName(null);
		pojo.setEmail("agni@agni.com");
		Date date=new Date();
		pojo.setDob(date);
		//pojo.setAge(25);
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		System.out.println(json);

	}

}
