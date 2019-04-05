package com.sapient.entity.inheritance;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();
		/*
		Employee emp = new Employee();
		emp.setName("Puneet");
		
		
		RegularEmployee regular = new RegularEmployee();
		regular.setName("Vivek");
		regular.setBonus(1000);
		regular.setSalary(10000);
		
		ContractEmployee contract = new ContractEmployee();
		contract.setName("Kamal");
		contract.setContractDuration(6);
		contract.setPayPerHour(1000.10f);
		
		
		
		
		dao.addEmployee(emp);
		dao.addEmployee(regular);
		dao.addEmployee(contract);
*/
		Employee employee=dao.findEmployee(29);
		
		System.out.println(employee);
	}

}
