package com.sapient.entity.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.sapient.entity.inheritance.Employee;

@Entity
@DiscriminatorValue("2")
public class ContractEmployee extends Employee{
	
	private float payPerHour;
	
	private int contractDuration;

	public float getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}

	public int getContractDuration() {
		return contractDuration;
	}

	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}

	@Override
	public String toString() {
		super.toString();
		return "ContractEmployee [payPerHour=" + payPerHour + ", contractDuration=" + contractDuration + "]";
	}

	

}
