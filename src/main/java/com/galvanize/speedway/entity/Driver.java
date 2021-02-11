package com.galvanize.speedway.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Driver {
	
	@Id
	@GeneratedValue
	private Long driverId;
	
	private String firstName;
	
	private String lastName;
	
	private String nickName;
	
	private int age;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	private int wins;
	
	private int losses;
	
	@OneToMany(mappedBy = "owner")
	private List<Racecar> racecars;
	
	
	public Driver() {
		
	}
	

	public Driver(String firstName, String lastName, String nickName, int age, Date birthDate, int wins, int losses,
			List<Racecar> racecars) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.age = age;
		this.birthDate = birthDate;
		this.wins = wins;
		this.losses = losses;
		this.racecars = racecars;
	}

	public Long getDriverId() {
		return driverId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public int getAge() {
		return age;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public List<Racecar> getRacecars() {
		return racecars;
	}
	
	
	
	

}
