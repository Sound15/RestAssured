package jacksonAnnotations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonCreatorJsonPropertyPOJO {
	private int id;
	private String name;
	private String email;
	
	public JsonCreatorJsonPropertyPOJO (
			@JsonProperty("employeeId")
			int id,
			@JsonProperty("name")
			String name,
			@JsonProperty("email")
			String email
			
			) {
		this.id=id;
		this.email=email;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	

}
