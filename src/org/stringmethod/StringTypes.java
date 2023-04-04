package org.stringmethod;

public class StringTypes {
	
	public static void main(String[] args) {
		
		// immutable String
		String s1 = "java";
		String s2 = "programme";
		
		int id1 = System.identityHashCode(s1);
		System.out.println(id1);
		int id2 = System.identityHashCode(s2);
		System.out.println(id2);
		
		String concat = s1.concat(s2);
		int id3 = System.identityHashCode(concat);
		System.out.println(id3);
		System.out.println("*********");
		
		// Mutable String 
		StringBuilder s4 = new StringBuilder("selenium");
		StringBuilder s5 = new StringBuilder("project");
		
		int id4 = System.identityHashCode(s4);
		System.out.println(id4);
		int id5 = System.identityHashCode(s5);
		System.out.println(id5);
		
		StringBuilder append = s4.append(s5);
		int id6 = System.identityHashCode(append);
		System.out.println(id6);
		
		
	}

}
