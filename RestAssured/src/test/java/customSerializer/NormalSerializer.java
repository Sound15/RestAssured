package customSerializer;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;


public class NormalSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		JsonSerializePOJO employee=new JsonSerializePOJO();
		employee.setFirstName("Agni");
		employee.setLastName("A");
		employee.setEmail("agni@agni.com");
		employee.setSkills(Arrays.asList("java","selenium"));
		
		DevicePOJO devices=new DevicePOJO();
		devices.setLaptop("MacbookPro");
		devices.setMobile("Iphone 14 Pro Max");
		employee.setDevices(devices);
		
		ObjectMapper mapper=new ObjectMapper();
		
		//codes of @JsonSerialize annotaion
//		SimpleModule simplemodule=new SimpleModule();
//		simplemodule.addSerializer(JsonSerializePOJO.class,new CustomSerializer());
//		mapper.registerModule(simplemodule);
		
		String employeejson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(employeejson);
		

	}

}
