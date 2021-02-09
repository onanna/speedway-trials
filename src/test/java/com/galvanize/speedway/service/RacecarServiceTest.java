package com.galvanize.speedway.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.galvanize.speedway.entity.Racecar;

public class RacecarServiceTest {
	
	RacecarService racecarService;

	
	
	@Test
	public void test_createRacecars() {
		racecarService = new RacecarService();		
		Racecar actualRacecar = racecarService.addRacecar(new Racecar());
		assertNotNull(actualRacecar.getId());
	}

}
