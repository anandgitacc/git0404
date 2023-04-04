package org.employee;

import org.clientdetails.Client;

public class EmployeeDetails {
	
	private void empName() {
		// Business logic
		System.out.println("Employee name: anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
	
	private void empID() {
		System.out.println("Employee id: 111");
	}
	
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		
		// method call
		e.empName();
		e.empMobile();
		e.empID();
		
		Company c = new Company();
		c.companyName();
		
	}
	
	
	

}
