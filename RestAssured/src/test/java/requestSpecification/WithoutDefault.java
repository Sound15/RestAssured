package requestSpecification;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class WithoutDefault {
	RequestSpecification requestspecification;

	@BeforeSuite
	public void setRequestSpecification() {
		requestspecification=/*given()*/with().baseUri("http://localhost:3000/").basePath("employees");
	}
	@Test
	public void getAllEmployees() {

		 given().spec(requestspecification)
        .when().get()
        .prettyPrint();
	}
	
	@Test
	public void getAnEmployees() {
		 given().spec(requestspecification)
        .when().get("/74a7")
        .prettyPrint();
	}
	
	@Test
	public void createAnEmployeeBDD() {
		RequestSpecification specification=given().contentType(ContentType.JSON).baseUri("http://localhost:3000/").basePath("employees");
		given().spec(specification)
		       .body("{\r\n"
		       		+ "    \"first_name\":\"Alan\",\r\n"
		       		+ "    \"last_name\":\"Mex\",\r\n"
		       		+ "    \"email\":\"alan@gmail.com\"\r\n"
		       		+ "}")
	    .when().post()
	    .prettyPrint();
	}
}
