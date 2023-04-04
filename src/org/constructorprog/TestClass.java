package org.constructorprog;

public class TestClass {
	
	public static void main(String[] args) {
		
		int i1 = 10;
		
		// boxing
		Integer i2 = Integer.valueOf(i1);
		
		// unboxing
		int i3 = i2.intValue();
		
		
		// autoboxing
		Integer i4 = 20;
		
		// auto unboxing
		int i5 = i3;
		
		
		
	}

}
