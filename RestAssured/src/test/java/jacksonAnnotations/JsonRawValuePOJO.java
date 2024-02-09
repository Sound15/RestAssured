package jacksonAnnotations;


import com.fasterxml.jackson.annotation.JsonRawValue;

public class JsonRawValuePOJO {
	private int id;
	private String name;
	private String email;
//	@JsonRawValue
//	private String skills="java";
	
	@JsonRawValue
	private String skills="{[\"java\",\"selenium\"]}";
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
