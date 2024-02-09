package jsonschema_validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;


//if schema is not in resource folder
public class WithoutClassPath {
	@Test
	public void validationUsingMatchesJsonSchema() throws FileNotFoundException {
		File inputjson=new File("src/test/resources/input.json");
		File inputschema=new File("src/test/resources/schema.json");
		//FileInputStream inputschema=new FileInputStream("src/test/resources/schema.json");	
		//FileReader inputschema=new FileReader("src/test/resources/schema.json");
		RestAssured.given().baseUri("http://localhost:3000/")
        .header("Content-Type","application/json").body(inputjson)
        .when().post("employees")
        .then().body(JsonSchemaValidator.matchesJsonSchema(inputschema));
//		.then().body(JsonSchemaValidator.matchesJsonSchema("{\r\n"
//				+ "  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\r\n"
//				+ "  \"type\": \"object\",\r\n"
//				+ "  \"properties\": {\r\n"
//				+ "    \"firstname\": {\r\n"
//				+ "      \"type\": \"string\"\r\n"
//				+ "    },\r\n"
//				+ "    \"lastname\": {\r\n"
//				+ "      \"type\": \"string\"\r\n"
//				+ "    },\r\n"
//				+ "    \"email\": {\r\n"
//				+ "      \"type\": \"string\"\r\n"
//				+ "    }\r\n"
//				+ "  },\r\n"
//				+ "  \"required\": [\r\n"
//				+ "    \"firstname\",\r\n"
//				+ "    \"lastname\",\r\n"
//				+ "    \"email\"\r\n"
//				+ "  ]\r\n"
//				+ "}"));
     
		}

}
