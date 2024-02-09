package customSerializer;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using=CustomSerializer.class)
public class JsonSerializePOJO {
	private String firstName;
	private String lastName;
	private String email;
	private List<String> skills;
	private DevicePOJO devices;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public DevicePOJO getDevices() {
		return devices;
	}
	public void setDevices(DevicePOJO devices) {
		this.devices = devices;
	}
	

}
