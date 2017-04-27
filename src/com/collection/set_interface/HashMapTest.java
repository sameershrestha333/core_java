package com.collection.set_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "John");
		hashMap.put(4, "Obama");
		hashMap.put(5, "Guru");
		hashMap.put(2, "Apple");
		hashMap.put(6, "Zara");
		hashMap.put(3, "Pardeep");
		// Print the HashMap object
		System.out.println("HashMap elements");
		System.out.println(hashMap);
		for(Map.Entry m: hashMap.entrySet()){
			System.out.println(m.getKey()+ " , " +m.getValue());
		}
		
	}

}
