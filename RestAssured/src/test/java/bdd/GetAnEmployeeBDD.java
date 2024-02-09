package bdd;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetAnEmployeeBDD {
		@Test
		public void getAnEmployees() {
			given().baseUri("http://localhost:3000/")
	        .when().get("employees/c06f")
	        .prettyPrint();
		}
}
