package jacksonAnnotations;


import com.fasterxml.jackson.annotation.JsonValue;

public class JsonValuePOJO {

	private int id;
	private String name;
	private String email;
	
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
	@JsonValue
	public String usethis() {
		//return null;
		return this.name;
	}
}
