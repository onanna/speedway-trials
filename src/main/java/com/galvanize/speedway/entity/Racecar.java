package com.galvanize.speedway.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Racecar {

	@Id
	@GeneratedValue
	private Long id;

	private String nickName;

	private String model;

	//@ManyToOne
	@JoinColumn(name = "driver_id")
	//@JsonIgnore
	private Long owner;	

	private boolean available;

	private int topSpeed;

	private String type;

	private int year;
	
	//private Long owner;

	public Racecar() {

	}

//	public Racecar(String nickName, String model, Driver driver, boolean available, int topSpeed, String type,
//			int year) {
//		super();
//		this.nickName = nickName;
//		this.model = model;
//		this.driver = driver;
//		this.available = available;
//		this.topSpeed = topSpeed;
//		this.type = type;
//		this.year = year;
//		//this.owner = driver.getId();
//	}

	public Racecar(String nickName, String model, Long owner, boolean available, int topSpeed, String type, int year) {
		super();
		this.nickName = nickName;
		this.model = model;
		this.owner = owner;
		this.available = available;
		this.topSpeed = topSpeed;
		this.type = type;
		this.year = year;
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

//	public Driver getDriver() {
//		return driver;
//	}

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
		return owner;
	}
	
//	public Long getOwner() {
//		return this.driver.getDriverId();
//	}
	
//	public void setDriver(Driver driver) {
//		this.driver = driver;
//	}
	
	

}
