package bdd;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class CreateAnEmployeeBDD {
	@Test
	public void createAnEmployeeBDD() {
		given().baseUri("http://localhost:3000/")
		       .header("Content-Type","application/json")
		       .body("{\r\n"
		       		+ "    \"first_name\":\"Alan\",\r\n"
		       		+ "    \"last_name\":\"Mex\",\r\n"
		       		+ "    \"email\":\"alan@gmail.com\"\r\n"
		       		+ "}")
	    .when().post("employees")
	    .prettyPrint();
	}
	
}
