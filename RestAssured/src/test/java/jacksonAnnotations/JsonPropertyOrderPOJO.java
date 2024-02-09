package jacksonAnnotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonPropertyOrder({"id","name","email"})
@JsonPropertyOrder(alphabetic=true)
public class JsonPropertyOrderPOJO {
	private int id;
	private String name;
	private String email;
	
	@JsonGetter(value="amployeeId")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@JsonGetter(value="bname")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonGetter(value="cemail")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
