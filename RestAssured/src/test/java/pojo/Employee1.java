package pojo;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {

	public static void main(String[] args) throws JsonProcessingException {
		Employee employee=new Employee();
		employee.setFirstName("Mark");
		employee.setLastName("Antony");
		employee.setEmail("mark@gmail.com");
		employee.setSkills(Arrays.asList("java","selenium"));
		
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
		
		ObjectMapper mapper=new ObjectMapper();
		String employeejson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(employeejson);

	}

}
