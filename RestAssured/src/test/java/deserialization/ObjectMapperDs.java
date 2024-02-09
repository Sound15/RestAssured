package deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.Employee;

public class ObjectMapperDs {
	String json="{\r\n"
			+ "    \"firstName\":\"Agni\",\r\n"
			+ "    \"lastName\":\"A\",\r\n"
			+ "    \"email\":\"Agni@agni.com\",\r\n"
			+ "    \"skills\":[\"java\",\"selenium\"]\r\n"
			+ "}";
	public void objectmapper() throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper=new ObjectMapper();
		Employee employee=mapper.readValue(json,Employee.class);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
	}
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapperDs objectmapperds=new ObjectMapperDs();
		objectmapperds.objectmapper();

	}

}
