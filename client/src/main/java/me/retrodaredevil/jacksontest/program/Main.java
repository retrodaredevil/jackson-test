package me.retrodaredevil.jacksontest.program;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.Duration;

public final class Main {
	private Main(){ throw new UnsupportedOperationException(); }

	private static final ObjectMapper MAPPER = new ObjectMapper().findAndRegisterModules();

	public static int doMain(String[] args){
		System.out.println("Result of ObjectMapper.findModules():");
		System.out.println(ObjectMapper.findModules());
		Object thing = MapperFeature.ALLOW_VOID_VALUED_PROPERTIES; // This is here to prove that we're using 2.12
		System.out.println(thing);
		try {
			System.out.println(MAPPER.readValue("\"PT5M\"", Duration.class));
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.exit(doMain(args));
	}
}
