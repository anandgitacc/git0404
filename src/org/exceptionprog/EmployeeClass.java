package org.exceptionprog;

public class EmployeeClass {
	
	public static void main(String[] args) throws EmployeeNotFoundException, NullPointerException {
		
		String id = "2001";
		
		if (id.startsWith("1001")) {
			System.out.println("Valid employee id");
		}
		
		else {
			throw new EmployeeNotFoundException();
		}
		
	}

}
