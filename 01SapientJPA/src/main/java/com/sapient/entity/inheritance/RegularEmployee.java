package com.sapient.entity.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.sapient.entity.inheritance.Employee;

@Entity
@DiscriminatorValue("1")
public class RegularEmployee extends Employee{
	
	private float salary;
	
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		super.toString();
		return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + "]";
	}

}
