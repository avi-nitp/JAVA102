package com.sapient.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name="avgSalary",query="select AVG(e.salary) from Employee1 e"),
	@NamedQuery(name="allEmployee",query="select e from Employee1 e"),
	@NamedQuery(name="minSalary",query="select MIN(e.salary) from Employee1 e"),
	@NamedQuery(name="getSalary",query="select e.salary from Employee1 e Where e.name=:empname")
})
public class Employee1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name="EMP_NAME")
	String name;
	
	double salary;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="employee")
	List<Address>addresses;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="emp")
	List<Email>emails;
	
	public Employee1(){
		
	}
	

	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


	public List<Email> getEmails() {
		return emails;
	}


	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}


	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", addresses=" + addresses
				+ ", emails=" + emails + "]";
	}


	

	
	
	

}
