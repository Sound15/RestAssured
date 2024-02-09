package raconcepts;

import io.restassured.RestAssured;

public class DefaultUriPort {

	public static void main(String[] args) {
		RestAssured.given().log().all().when().get();

	}

}
