package com.sapient.entity;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		
		Employee1 emp = new Employee1("Aman3", 104343.33);
		
		 Address homeAddress=new Address(2344, "RK", "Bhagalpur");
	      Address officeAddress=new Address(2345, "Sector 21", "Gurgaon");
	      List<Address>addresses=new ArrayList<Address>();
	      addresses.add(officeAddress);
	      addresses.add(homeAddress);
	      
		emp.setAddresses(addresses);
		
		//Employee to address
	      homeAddress.setEmployee(emp);
	      officeAddress.setEmployee(emp);
		//dao.addEmployee(emp);
		
	//	Employee1 e = dao.findEmployee(3);
		//System.out.println(e);
      System.out.println(dao.getAvgSalary());
     
      System.out.println(dao.getMinSalary());
      System.out.println(dao.getSalary("Priya"));
      
//     List<Address>addresses2=new ArrayList<Address>();
//     addresses2.add(new Address(555,"Patna Devi","Patna"));
//     dao.addAddress(addresses2, 33);
     // dao.updateAddress(33, "Patna", "Gaya");
      
      Email primary=new Email("aman34@xyz.com");
      Email secondary=new Email("mysecondmail2@xyz.com");
      List<Email>emails=new ArrayList<>();
      emails.add(secondary);
      emails.add(primary);
      emp.setEmails(emails);
      
      primary.setEmp(emp);
      secondary.setEmp(emp);
      
      
     dao.addEmployee(emp);
      
      System.out.println(dao.getAllEmployees());
	}

}
