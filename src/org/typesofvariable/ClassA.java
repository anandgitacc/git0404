package org.typesofvariable;

public class ClassA {
	
	// instance variable
	private int b = 20;
	
	
	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		
		System.out.println(obj.b);
		
		int b = 30;
		System.out.println(b);
		
		System.out.println("*************");
		System.out.println(obj.b);
		
	}
	
	

}
