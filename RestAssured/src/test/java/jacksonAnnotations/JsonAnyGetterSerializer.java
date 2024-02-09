package jacksonAnnotations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		JsonAnyGetterPOJO anygetterpojo=new JsonAnyGetterPOJO();
		Map<String,Object> mapvalue=new HashMap<String,Object>();
		mapvalue.put("firstName","Agni");
		mapvalue.put("lastName","A");
		mapvalue.put("email","agni@agni.com");
		mapvalue.put("skills",Arrays.asList("java","go"));
		
		anygetterpojo.setEmployees(mapvalue);
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(anygetterpojo);
		System.out.println(json);
		

	}

}
