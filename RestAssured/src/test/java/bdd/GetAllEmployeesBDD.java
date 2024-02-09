package bdd;

import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetAllEmployeesBDD {
	@Test
	public void getAllEmployees() {
//		RestAssured.given().baseUri("http://localhost:3000/")
//		           .when().get("employees")
//		           .prettyPrint();
		
		given().baseUri("http://localhost:3000/")
        .when().get("employees")
        .prettyPrint();
	}
}
