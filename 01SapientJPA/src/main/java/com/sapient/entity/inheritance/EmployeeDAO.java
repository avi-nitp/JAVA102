package com.sapient.entity.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sapient.entity.Employee1;


public class EmployeeDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
    
	public void addEmployee(Employee emp){

		
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		em.persist(emp);
		
		transaction.commit();
		em.close();
		
		
	}
	
	public Employee findEmployee(int id)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Employee emp =  em.find(Employee.class, id);
//		emp.setSalary(33333.44);
		
	
		transaction.commit();
		em.close();
		return emp;
	}
	
	

}
