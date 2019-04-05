package com.sapient.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
	int houseNumber;
	
	String location;
	
	String city;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="E_ID")
	Employee1 employee;

	public Address( int houseNumber, String location, String city) {
		super();
		this.houseNumber = houseNumber;
		this.location = location;
		this.city = city;
	}

	public Address() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee1 getEmployee() {
		return employee;
	}

	public void setEmployee(Employee1 employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber + ", location=" + location + ", city=" + city
				+ "]";
	}

	
	
	
}
