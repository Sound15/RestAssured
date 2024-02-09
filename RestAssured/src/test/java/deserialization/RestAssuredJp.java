package deserialization;

import io.restassured.path.json.JsonPath;
import pojo.Employee;

public class RestAssuredJp {
	String json="{\r\n"
			+ "    \"firstName\":\"Agni\",\r\n"
			+ "    \"lastName\":\"A\",\r\n"
			+ "    \"email\":\"Agni@agni.com\",\r\n"
			+ "    \"skills\":[\"java\",\"selenium\"]\r\n"
			+ "}";
	public void raJsonpath() {
		JsonPath jsonpath=new JsonPath(json);
		Employee employee=jsonpath.getObject("$", Employee.class);
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getSkills());
		
	}

	public static void main(String[] args) {
		RestAssuredJp restassuredjp=new RestAssuredJp();
		restassuredjp.raJsonpath();
		

	}

}
