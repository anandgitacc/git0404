package org.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProg {

	public static void main(String[] args) {

		// Set

		// insertion order
		Set<Integer> se1 = new LinkedHashSet<>();

		se1.add(10); // 0
		se1.add(20); // 1
		se1.add(10); // 2
		se1.add(30);
		se1.add(40);
		se1.add(50);
		se1.add(60);
		se1.add(20);
		se1.add(80);
		System.out.println(se1);

		// enhanced for only will work in set
		for (Integer integer : se1) {

			System.out.println(integer);
		}

		Set<Integer> se2 = new LinkedHashSet<>();

		se2.add(10); 
		se2.add(11); 
		se2.add(10); 
		se2.add(22);
		se2.add(33);
		se2.add(50);
		se2.add(66);
		System.out.println(se2);
		System.out.println("***********");
		
		// addAll
		se1.addAll(se2);
		System.out.println(se1);
		
		// retainAll
		se1.retainAll(se2);
		System.out.println(se1);
		
		// removeAll
		se1.removeAll(se2);
		System.out.println(se1);
		
		
		
		
		
		

	}

}
