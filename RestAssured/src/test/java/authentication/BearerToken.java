package authentication;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BearerToken {
	
	@Test
	public void bearertokenAuth() {
		String token="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";
		given().header("Authorization","Bearer "+token)
		.when().get("https://api.github.com/user/repos")
		.prettyPrint();
	}

}
