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
public class Email {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String email;

	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="E_ID")
	private Employee1 emp;
	
	public Email(String email) {
		super();
		this.email = email;
	}

	public Email() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public Employee1 getEmp() {
		return emp;
	}

	public void setEmp(Employee1 emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}

	
	
	
}
