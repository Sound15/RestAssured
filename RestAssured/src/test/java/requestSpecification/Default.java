package requestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Default {
	RequestSpecification rs;

	@BeforeSuite
	public void setRequestSpecification() {
		rs=given().baseUri("http://localhost:3000/").basePath("employees");
		RestAssured.requestSpecification=rs;
	}
	@Test
	public void getAllEmployees() {

		 given()
        .when().get()
        .prettyPrint();
	}
	
	@Test
	public void getAnEmployees() {
		 given()
        .when().get("/74a7")
        .prettyPrint();
	}
	

}
