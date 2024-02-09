package jsonschema_validation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
//if schema is in resource folder
public class ClassPath {
	@Test
	public void classpath() {
		File inputjson=new File("src/test/resources/input.json");
		RestAssured.given().baseUri("http://localhost:3000/")
		           .header("Content-Type","application/json").body(inputjson)
		           .when().post("employees")
		           .then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
		        
	}

}
