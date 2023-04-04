package org.exceptionprog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionProg {
	
	public static void main(String[] args) {
		
		// exception
//		// Arithmetic exp
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4/0);
//		System.out.println(5);
//		System.out.println(6);
//		
//		// Null pointer exp
//		String s1 = null;
//		char ca1 = s1.charAt(2);
//		System.out.println(ca1);
//		
//		// String index out of bound exp
//		//           0123
//		String s2 = "java";
//		char ca2 = s2.charAt(7);
//		System.out.println(ca2);
		
		// Array index out of bound exp
		int[] a = new int[4];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
//		a[4] = 10;
		
		System.out.println(a[2]);
		
		// index out of bound of bound exp??
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		System.out.println(li1.get(6));
		
		// input mismatch exp
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter reg number : ");
		
		int regNumber = scanner.nextInt();
		System.out.println("Your reg number :" +regNumber);
		
		// number format exp
		String s2 = "12345";
		int parseInt1 = Integer.parseInt(s2);
		System.out.println(parseInt1);
		
		String s3 = "12345anand";
		int parseInt2 = Integer.parseInt(s3);
		System.out.println(parseInt2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
