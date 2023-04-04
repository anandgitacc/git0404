package org.polyclass;

public class EmployeeDetails {

	// empty argument or normal method
	private void employee() {
		System.out.println("Employee details as follow : ");
	}

	// based on data type
	private void employee(String empName) {
		System.out.println("Employee name : " + empName);
	}

	private void employee(int empId) {
		System.out.println("Employee id : " + empId);
	}

	// based on data type count
	private void employee(String empName, int empId, float empSalary) {
		System.out.println("Employee name : " + empName);
		System.out.println("Employee id : " + empId);
		System.out.println("Employee salary : "+empSalary);
	}
	
	// based on data type order
		private void employee(int empId, String empName, float empSalary) {
			System.out.println("Employee id : " + empId);
			System.out.println("Employee salary : "+empSalary);
			System.out.println("Employee name : " + empName);
		}
	
		public static void main(String[] args) {
			
			EmployeeDetails a = new EmployeeDetails();
			a.employee();
			a.employee("Anand");
			a.employee(111);
			a.employee("Anand", 111, 87657.338f);
			a.employee(111, "Anand", 87657.338f);
			
			EmployeeDetails b = new EmployeeDetails();
			b.employee();
			b.employee("Siva");
			b.employee(222);
			b.employee("Siva", 222, 99874.338f);
			b.employee(222, "Siva", 99874.338f);
			
			
			
			
			
		}
		
		
		
		
		
		

}
