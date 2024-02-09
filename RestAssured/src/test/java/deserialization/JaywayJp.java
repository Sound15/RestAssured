package deserialization;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import pojo.Employee;

public class JaywayJp {
	String json="{\r\n"
			+ "    \"firstName\":\"Agni\",\r\n"
			+ "    \"lastName\":\"A\",\r\n"
			+ "    \"email\":\"Agni@agni.com\",\r\n"
			+ "    \"skills\":[\"java\",\"selenium\"]\r\n"
			+ "}";
	public void jayway() {
		JacksonMappingProvider mappingProvider= new JacksonMappingProvider();
		Configuration configuration=Configuration.builder().mappingProvider(mappingProvider).build();
		Employee employee=JsonPath.using(configuration).parse(json).read("$",Employee.class);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
		
	}
	public static void main(String[] args) {
		JaywayJp jaywayjp=new JaywayJp();
		jaywayjp.jayway();
	}

}
