package com.galvanize.speedway.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.galvanize.speedway.TestHelper;
import com.galvanize.speedway.entity.Racecar;
import com.galvanize.speedway.repository.RacecarRepository;

@ExtendWith(MockitoExtension.class)
public class RacecarServiceTest {

	RacecarService racecarService;

	@Mock
	RacecarRepository racecarRepo;

	@BeforeEach
	public void init() {
		racecarService = new RacecarService(racecarRepo);
	}

	@Test
	public void test_createRacecars() throws JsonParseException, JsonMappingException, IOException {

		Racecar racecar = TestHelper.generateRacecar();
		//Driver driver = TestHelper.generateDriver();
		//racecar.setId(id);(driver);

		when(racecarRepo.save(Mockito.any(Racecar.class))).thenReturn(racecar);

		Racecar actualRacecar = racecarService.addRacecar(new Racecar());

		assertNotNull(actualRacecar.getId());
		assertEquals(43, actualRacecar.getId());
		assertEquals("The Condor", actualRacecar.getNickName());
		assertEquals("Corvette", actualRacecar.getModel());
		assertEquals(2019, actualRacecar.getYear());
		assertEquals(332, actualRacecar.getOwner());

		verify(racecarRepo).save(Mockito.any(Racecar.class));
	}

	

}
