package customSerializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomSerializer extends StdSerializer<JsonSerializePOJO>{

	public CustomSerializer(Class<JsonSerializePOJO> t) {
		super(t);
	}
	
	public CustomSerializer() {
		this(null);
		}

	@Override
	public void serialize(JsonSerializePOJO value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeStartObject();
		gen.writeStringField("firstName", value.getFirstName());
		gen.writeStringField("lastName", value.getLastName());
		gen.writeStringField("email", value.getEmail());
		gen.writeEndObject();
		
	}

}
