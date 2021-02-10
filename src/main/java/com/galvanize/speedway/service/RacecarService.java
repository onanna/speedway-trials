package com.galvanize.speedway.service;

import org.springframework.stereotype.Service;

import com.galvanize.speedway.entity.Racecar;
import com.galvanize.speedway.repository.RacecarRepository;

@Service
public class RacecarService {
	
	private RacecarRepository racecarRepository;
	
	public RacecarService(RacecarRepository racecarRepository) {
		this.racecarRepository = racecarRepository;
	}

	public Racecar addRacecar(Racecar racecar) {	
		return racecarRepository.save(racecar);		
	}

}
