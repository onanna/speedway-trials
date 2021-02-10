package com.galvanize.speedway.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galvanize.speedway.entity.Racecar;


public interface RacecarRepository extends JpaRepository<Racecar, Long> {

}
