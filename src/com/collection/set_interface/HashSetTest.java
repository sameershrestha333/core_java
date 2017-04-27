package com.collection.set_interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * this class is used to show the HashSet functionality
 * @author sameer
 *
 */
public class HashSetTest {

	public static void main(String[] args) {
			//Creating HashSet object
		Set<String> hashset=new HashSet<String>();
		hashset.add("John");
		hashset.add("Obama");
		hashset.add("Guru");
		hashset.add("Zara");
		hashset.add("Pardeep");


		//printing HashSet object
			System.out.println("HashSet elements");
			System.out.println(hashset);
			//Printing HashSet elements using Iterator
			Iterator<String> iterator=hashset.iterator();
			System.out.println("HashSet element using iterator:");
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				
			}
		
	}

}
