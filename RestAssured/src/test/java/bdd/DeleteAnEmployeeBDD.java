package bdd;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class DeleteAnEmployeeBDD {
	@Test
	public void deleteAnEmployees() {
		given().baseUri("http://localhost:3000/")
        .when().delete("employees/14c9")
        .prettyPrint();
	}
}
