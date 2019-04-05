package com.sapient.entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;



public class EmployeeDAO {
	//SessionFactory  sesssionFactory = new Configuration().configure().buildSessionFactory();
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
    
	public void addEmployee(Employee1 emp){
//		Session session = sesssionFactory.openSession();
//		Transaction tx = null;
//		tx = session.beginTransaction();
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		em.persist(emp);
		
		transaction.commit();
		em.close();
		
		
	}
	
	public Employee1 findEmployee(int id){
		
		EntityManager em = emf.createEntityManager();
	
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Employee1 emp =  em.find(Employee1.class, id);
//		emp.setSalary(33333.44);
		
	
		transaction.commit();
		em.close();
		
		emp.setSalary(44444.44);
		
		EntityManager em1 = emf.createEntityManager();
		
		EntityTransaction transaction1 = em1.getTransaction();
		transaction1.begin();
		
		em1.merge(emp);
		
		transaction1.commit();
		em1.close();
		
		
		return emp;
	}

	public double getAvgSalary()
	{
		EntityManager em=emf.createEntityManager();
		TypedQuery<Double>query=em.createNamedQuery("avgSalary", Double.class);
		Double sal=query.getSingleResult();
		return sal;
				
	}
	
	public List<Employee1>getAllEmployees()
	{
		EntityManager em=emf.createEntityManager();
		TypedQuery<Employee1>query=em.createNamedQuery("allEmployee",Employee1.class);
		List<Employee1>emp=query.getResultList();
		return emp;
	}
	public double getMinSalary()
	{
		EntityManager em=emf.createEntityManager();
		TypedQuery<Double>query=em.createNamedQuery("minSalary", Double.class);
		Double sal=query.getSingleResult();
		return sal;
				
	}
	public List<Double> getSalary(String name)
	{
		EntityManager em=emf.createEntityManager();
		TypedQuery<Double>query=em.createNamedQuery("getSalary", Double.class);
		query.setParameter("empname",name );
		List<Double>sal=query.getResultList();
		return sal;
	}
	public void addAddress(List<Address> addresses,int id)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		Employee1 emp=em.find(Employee1.class, id);
		emp.setAddresses(addresses);
		transaction.commit();
		em.close();
	}
	
	public void updateAddress(int id,String city,String newCity)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		Employee1 emp=em.find(Employee1.class, id);
		List<Address>addresses=emp.getAddresses();
		addresses.stream().filter((e)->e.getCity().equalsIgnoreCase(city)).forEach(a->a.setCity(newCity));
		//System.out.println(addresses);
		emp.setAddresses(addresses);
		transaction.commit();
		em.close();
	}
}