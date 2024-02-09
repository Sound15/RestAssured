package jsonschema_validation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatcher {
	@Test
	public void validate() throws IOException {
		File inputjson=new File("src/test/resources/input.json");
		File inputschema=new File("src/test/resources/schema.json");
		String jsonContent=FileUtils.readFileToString(inputjson,"UTF-8");
		MatcherAssert.assertThat(jsonContent,JsonSchemaValidator.matchesJsonSchema(inputschema));
	}

}
