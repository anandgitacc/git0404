package org.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapProg {
	
	public static void main(String[] args) {
		
		// insertion order
		Map<Integer, String> mp1 = new LinkedHashMap<>();
		
		mp1.put(10, "java");
		mp1.put(20, "selenium");
		mp1.put(30, "framework");
		mp1.put(10, "java");
		mp1.put(40, "java");
		mp1.put(50, "programme");
		mp1.put(60, "sql");
		
		System.out.println(mp1);
		
		int size = mp1.size();
		System.out.println(size);
		
		boolean containsKey = mp1.containsKey(30);
		System.out.println(containsKey);
		
		boolean containsValue = mp1.containsValue("programme");
		System.out.println(containsValue);
		
		String string = mp1.get(30);
		System.out.println(string);
		
		Set<Integer> keySet = mp1.keySet();
		
		for (Integer integer : keySet) {
			
			System.out.println(integer);
		}
		
		Collection<String> values = mp1.values();
		
		for (String string2 : values) {
			
			System.out.println(string2);
		}
		
		Set<Entry<Integer, String>> entrySet = mp1.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
