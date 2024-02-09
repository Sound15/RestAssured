package non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateAnEmployee {
	@Test
	public void createAnEmployees() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification reqspecification=RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"first_name\":\"Alan\",\r\n"
						+ "    \"last_name\":\"Mex\",\r\n"
						+ "    \"email\":\"alan@gmail.com\"\r\n"
						+ "}");
		Response response=reqspecification.request(Method.POST,"employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

}
}