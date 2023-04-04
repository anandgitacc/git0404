package org.exceptionprog;


public class ExceptionHandle {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		try {
			// Arithmetic exp
			System.out.println(4/2);
			
			try {
				// String index out of bound exp
				String s2 = null;
				char ca2 = s2.charAt(7);
				System.out.println(ca2);
			} 
			catch (StringIndexOutOfBoundsException e) {
				System.out.println("inner catch : Don't try to fetch a char beyond String length");
			}
			
			finally {
				System.out.println("inner finally block");
			}
			
		} 
		
		catch (ArithmeticException e) {
			System.out.println("outer : Don't try to divide a number by Zero");
		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("outer : Don't try to fetch a char beyond String length");
		}
		
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("outer : Commonly exception handled");
		}
		
		finally {
			System.out.println("outer finally block");
		}
		
		System.out.println(5);
		System.out.println(6);
		
		
		
	}

}
