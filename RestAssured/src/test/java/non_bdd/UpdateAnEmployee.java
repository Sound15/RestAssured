package non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateAnEmployee {
	@Test
	public void updateAnEmployees() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification reqspecification=RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"first_name\":\"Alan\",\r\n"
						+ "    \"last_name\":\"Mex\",\r\n"
						+ "    \"email\":\"mex@gmail.com\"\r\n"
						+ "}");
		Response response=reqspecification.request(Method.PUT,"employees/cbac");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		
	}
}
