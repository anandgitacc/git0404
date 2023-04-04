package org.constructorprog;

public class Employee extends Company {

	// empty argument/ default constructor
	// Non parametrized constructor
	public Employee() {
		this("anand", 11222);
		System.out.println("Employee details : ");
	}

	// String Parametrized constructor
	public Employee(String name, int refId) {
		this(111);
		System.out.println("String parameterized Constructor");
		System.out.println("Employee name: " + name);
	}

	// int Parametrized constructor
	public Employee(int empId) {
		super("Greens");
		System.out.println("int parameterized Constructor");
		System.out.println("Employee id: " + empId);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
//		Employee e1 = new Employee("anand");
//		Employee e2 = new Employee(111);
		
		
	}
	
	
	
	

}
