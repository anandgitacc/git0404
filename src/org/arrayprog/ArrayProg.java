package org.arrayprog;

public class ArrayProg {
	
	public static void main(String[] args) {
		
		// array syntax
		// 2D
		// R C
		int[][] a = new int[2][2];
		
		//i  j
		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		
		System.out.println(a[1][0]);
		
		for (int i = 0; i < a.length; i++) { //Row
			
			for (int j = 0; j < a.length; j++) { //column
				
				System.out.println(a[i][j]);
			}
		}
		System.out.println("*******");
		
		// 2D in enhanced for loop
		// a -> [[10,20],[30,40]]
		
		for (int[] x : a) {
			
			for (int i : x) {
				
				System.out.println(i);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
