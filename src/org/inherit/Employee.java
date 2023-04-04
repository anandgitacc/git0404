package org.inherit;

//child class A
public class Employee extends Client {
	
	private void empName() {
		System.out.println("Employee name: Anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile");
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empMobile();
		e.empName();
		e.clName();
		e.clLocation();
		
		
	}

}
