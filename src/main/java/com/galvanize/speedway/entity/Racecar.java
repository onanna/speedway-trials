package com.galvanize.speedway.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Racecar {

	@Id
	@GeneratedValue
	private Long id;

	private String nickName;

	private String model;

	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Driver driver;	

	private boolean available;

	private int topSpeed;

	private String type;

	private int year;

	public Racecar() {

	}

	public Racecar(String nickName, String model, Driver driver, boolean available, int topSpeed, String type,
			int year) {
		super();
		this.nickName = nickName;
		this.model = model;
		this.driver = driver;
		this.available = available;
		this.topSpeed = topSpeed;
		this.type = type;
		this.year = year;
		//this.owner = driver.getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public String getModel() {
		return model;
	}

	public Driver getDriver() {
		return driver;
	}

	public boolean isAvailable() {
		return available;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public int getTopSpeedInKph() {
		return (int) Math.round(topSpeed * 1.6);
	}

	public String getType() {
		return type;
	}

	public int getYear() {
		return year;
	}
	
	public Long getOwner() {
		return this.driver.getId();
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	

}
