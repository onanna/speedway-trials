package com.galvanize.speedway.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.galvanize.speedway.TestHelper;
import com.galvanize.speedway.repository.DriverRepository;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class RacecarControllerIT {

	@Autowired
	MockMvc mvc;

	@Autowired
	ObjectMapper mapper;
	
	@Autowired
	DriverRepository driverRepository;


	@Test
	public void test_createRacecar() throws Exception {
		driverRepository.save(TestHelper.generateDriver());
		mvc.perform(post("/api/v1/speedway/racecars")
				.content(mapper.writeValueAsString(TestHelper.generateRacecarRequest()))
				.contentType(MediaType.APPLICATION_JSON))
		.andDo(print())
		.andExpect(status().isCreated())
		.andExpect(jsonPath("$.id").exists())
		.andExpect(jsonPath("$.nickName").value("The Condor"))
		.andExpect(jsonPath("$.model").value("Corvette"))
		.andExpect(jsonPath("$.year").value(2019))
		.andExpect(jsonPath("$.available").value(true))
		.andExpect(jsonPath("$.topSpeed").value(189))
		.andExpect(jsonPath("$.type").value("Truck"))
		.andExpect(jsonPath("$.owner").value(1));
		
	}
}
