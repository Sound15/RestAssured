package bdd;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class UpdateAnEmployeeBDD {
	@Test
	public void updateAnEmployeeBDD() {
		given().baseUri("http://localhost:3000/")
		       .header("Content-Type","application/json")
		       .body("{\r\n"
		       		+ "    \"first_name\":\"Alan\",\r\n"
		       		+ "    \"last_name\":\"Mex\",\r\n"
		       		+ "    \"email\":\"mex@gmail.com\"\r\n"
		       		+ "}")
	    .when().put("employees/14c9")
	    .prettyPrint();
	}
}
