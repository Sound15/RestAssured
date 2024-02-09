package raconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Serialization {
@Test
public void serialization() {
	Map<String,Object> jsonbody=new HashMap<String,Object>();
	List<String> skills=new ArrayList<String>();
	skills.add("java");
	skills.add("selenium");
	 jsonbody.put("first_name","Agni");
	 jsonbody.put("last_name", "A");
	 jsonbody.put("email", "agni@arul.com");
	 jsonbody.put("skills", skills);
	 System.out.println(jsonbody);
	given()
	.baseUri("http://localhost:3000/")
	.header("Content-Type","application/json")
	.body(jsonbody)
	.log()
	.all()
	.when()
	.post("employees")
	.then()
	.log()
	.all();
	
}

}
