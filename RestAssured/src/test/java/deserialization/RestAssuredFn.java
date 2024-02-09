package deserialization;

import java.util.Map;

import io.restassured.common.mapper.TypeRef;

import static io.restassured.RestAssured.*;

public class RestAssuredFn {
	
	public void restassuredfn() {
		Map<String,Object> response=given().baseUri("http://localhost:3000/")
				                    .when().get("employees/7972")
				                    .then().extract().body().as(new TypeRef <Map<String,Object>>(){
				                    	
				                    });
		System.out.println(response);
		System.out.println(response.get("first_name"));
		System.out.println(response.get("last_name"));
		System.out.println(response.get("email"));
		System.out.println(response.get("skills"));
		
		
	}

	public static void main(String[] args) {
		RestAssuredFn restassuredfn =new RestAssuredFn();
		restassuredfn.restassuredfn();
	}

}
