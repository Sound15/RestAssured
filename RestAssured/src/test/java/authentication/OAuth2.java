package authentication;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class OAuth2 {

	@Test
	public void oauth2() {
		String token="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";
		given().auth().oauth2(token).when().get("https://api.github.com/user/repos").prettyPrint();
	}
}
