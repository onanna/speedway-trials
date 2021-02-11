package com.galvanize.speedway;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.speedway.entity.Driver;
import com.galvanize.speedway.entity.Racecar;

public class TestHelper {

	public static Racecar generateRacecar() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Racecar racecar = mapper.readValue(new File("src/test/resources/racecar.json"), Racecar.class);
		return racecar;

	}

	public static Driver generateDriver() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Driver driver = mapper.readValue(new File("src/test/resources/driverRequest.json"), Driver.class);		return driver;

	}
	
	public static Racecar generateRacecarRequest() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Racecar racecar = mapper.readValue(new File("src/test/resources/racecarRequest.json"), Racecar.class);
		return racecar;

	}
}
