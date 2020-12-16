package me.retrodaredevil.jacksontest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class JacksonTestUtil {
	@Test
	void testDefaultMapper() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();
		System.out.println(mapper.readValue("\"PT5M\"", Duration.class));
	}

}
