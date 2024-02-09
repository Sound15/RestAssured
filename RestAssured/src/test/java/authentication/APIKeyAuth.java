package authentication;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class APIKeyAuth {

	@Test
	public void apikeyauth() {
//		given().when().get("https://api.openweathermap.org/data/2.5/weather?q=Exton&appid=4c9305267bcc49df87d478599e98f7c1")
//		.prettyPrint();
		
		given().queryParam("q","Trichy")
		       .queryParam("appid","4c9305267bcc49df87d478599e98f7c1")
		       .when()
		       .get("https://api.openweathermap.org/data/2.5/weather")
		       .then()
		       .log().body();//prettyPrint();
	}
}
