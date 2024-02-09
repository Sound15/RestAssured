package jsonschema_validation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;


public class Networknt {
	@Test
	public void networknt() throws IOException {
		ObjectMapper mapper=new ObjectMapper();
		JsonSchemaFactory factory=JsonSchemaFactory.getInstance(VersionFlag.V4);
		File inputjson=new File("src/test/resources/input.json");
		FileInputStream inputschema=new FileInputStream("src/test/resources/schema.json");
		JsonNode jsonnode=mapper.readTree(inputjson);
		JsonSchema schema=factory.getSchema(inputschema);
		Set<ValidationMessage> result=schema.validate(jsonnode);
		if(result.isEmpty()) {
			System.out.println("No Validation errors");
		}else {
			for(ValidationMessage message:result) {
				System.out.println(message);
			}
		}
		
		
		
		
	}

}
