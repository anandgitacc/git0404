package org.exceptionprog;

public class EmployeeNotFoundException extends Exception {
	
	@Override
	public String getMessage() {
		
		String msg = "Employee id is not valid";
		return msg;
	}

}
