package org.polymorphism;

public class EmployeeDetails {

	// empty argument
	private void employee() {
		System.out.println("Employee details as follows: ****");
	}

	// based on data type
	private void employee(String empName) {
		System.out.println("Employee Name: " + empName);
	}

	private void employee(int empId) {
		System.out.println("Employee id: " + empId);
	}

	// based on data type count
	private void employee(String empName, int empId, float empSalary) {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee id: " + empId);
		System.out.println("Employee salary: " + empSalary);
	}

	// based on data type order
	private void employee(int empId, String empName, float empSalary) {
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee id: " + empId);
		System.out.println("Employee salary: " + empSalary);
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails a = new EmployeeDetails();
		a.employee();
		a.employee("Anand");
		a.employee(111);
		a.employee("Anand", 111, 88765.876f);
		a.employee(111, "Anand", 88765.876f);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
