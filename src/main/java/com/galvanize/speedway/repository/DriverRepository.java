package com.galvanize.speedway.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galvanize.speedway.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

}
