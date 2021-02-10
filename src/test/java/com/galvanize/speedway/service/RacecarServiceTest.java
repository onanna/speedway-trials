package com.galvanize.speedway.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

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
	public void test_createRacecars() {
		when(racecarRepo.save(Mockito.any(Racecar.class))).thenReturn(addRacecarId(new Racecar()));
		
		Racecar actualRacecar = racecarService.addRacecar(new Racecar());
		
		assertNotNull(actualRacecar.getId());
		
		verify(racecarRepo).save(Mockito.any(Racecar.class));
	}
	
	private Racecar addRacecarId(Racecar racecar) {
		racecar.setId(1l);
		return racecar;
	}

}
