package com.galvanize.speedway.service;

import org.springframework.stereotype.Service;

import com.galvanize.speedway.entity.Racecar;

@Service
public class RacecarService {

	public Racecar addRacecar(Racecar racecar) {	
		racecar.setId(1l);
		return racecar;		
	}

}
