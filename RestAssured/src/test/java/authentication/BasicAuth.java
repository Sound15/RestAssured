package authentication;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuth {

	@Test
	public void basicauth() {
		given().auth().basic("postman", "password").baseUri("https://postman-echo.com/")
		       .when().get("basic-auth").prettyPrint();
	}
}
