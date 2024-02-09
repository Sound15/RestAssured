package requestSpecification;

import static io.restassured.RestAssured.*;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class Properties {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000/";
		RestAssured.basePath="employees";
		RequestSpecification specification=given().header("Content-Type","application/json")
				                                  .body("{\r\n"
				                                  		+ "    \"first_name\":\"Alan\",\r\n"
				                                  		+ "    \"last_name\":\"Mex\",\r\n"
				                                  		+ "    \"email\":\"alan@gmail.com\"\r\n"
				                                  		+ "}");
		Response response=specification.request(Method.POST);
		QueryableRequestSpecification quereqspec=SpecificationQuerier.query(specification);
		System.out.println(quereqspec.getHeaders());
		System.out.println(quereqspec.getBaseUri());
		System.out.println(quereqspec.getBasePath());
		
	}

}
