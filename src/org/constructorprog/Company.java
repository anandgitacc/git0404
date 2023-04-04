package org.constructorprog;

public class Company {

	// Parent - String Parametrized constructor
	public Company(String comName) {
		this(1122);
		System.out.println("Parent : String Parametrized constructor");
	}

	// Parent - int Parametrized constructor
	public Company(int comId) {
		System.out.println("Parent : int Parametrized constructor");
	}

}
