package org.access1;

// we can declare class as final but we cant inherit
public class ClassA {
	
	// static variable
//	final int a = 10;
	
	// final method
	public final void method1() {
		System.out.println("final method1");
	}
	
	public void method2() {
		final int b = 20;
		System.out.println("method2"+ b);
	}
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.method2();
		
	}
	

}
