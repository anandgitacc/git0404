package org.stringmethod;

public class StringMethods {
	
	public static void main(String[] args) {
		
		//           012345678...
		String s1 = "  java   programme    ";
		
		int length = s1.length();
		System.out.println(length);
		
		String upperCase = s1.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
		// string methods are case sensitive
		int indexOf = s1.indexOf('v');
		System.out.println(indexOf);
		
		int indexOf1 = s1.indexOf('a');
		System.out.println(indexOf1);
		
		int lastIndexOf = s1.lastIndexOf('m');
		System.out.println(lastIndexOf);
		
		char charAt = s1.charAt(2);
		System.out.println(charAt);
		
		// cntrl+2 then release then press L
		boolean equals = s1.equals("java programme");
		System.out.println(equals);
		
		String s2 = "java programme";
		
		boolean equals2 = s1.equals(s2);
		System.out.println(equals2);
		
		boolean ignoreCase = s1.equalsIgnoreCase("JAVA PROGRAM");
		System.out.println(ignoreCase);
		
		boolean contains = s1.contains("vaj");
		System.out.println(contains);
		
		String replace = s1.replace("java programme", "selenium");
		System.out.println(replace);
		
		boolean startsWith = s1.startsWith("va");
		System.out.println(startsWith);
		
		boolean endsWith = s1.endsWith("gram");
		System.out.println(endsWith);
		
		boolean empty = s1.isEmpty();
		System.out.println(empty);
		
		String trim = s1.trim();
		System.out.println(trim);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
