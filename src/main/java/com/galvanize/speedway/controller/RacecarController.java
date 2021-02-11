package com.galvanize.speedway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.galvanize.speedway.entity.Racecar;
import com.galvanize.speedway.service.RacecarService;

@RestController
@RequestMapping("api/v1/speedway")
public class RacecarController {
	
	private RacecarService service;
	
	
	public RacecarController(RacecarService service) {
		this.service = service;
	}



	@PostMapping("/racecars")
	@ResponseStatus(HttpStatus.CREATED)
	public Racecar createRaceCar(@RequestBody Racecar racecarRequest) {
		return service.addRacecar(racecarRequest);
	}

}
