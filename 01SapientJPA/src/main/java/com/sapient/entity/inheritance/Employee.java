package com.sapient.entity.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
	//@NamedQuery(name="minSalary1",query="")
})
@Table(name = "employeeJoined")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="employee_type", discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
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

	private String name;

	@Override
	public String toString() {
		//super.toString();
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
