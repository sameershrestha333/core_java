package com.collection.set_interface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("John");
		treeSet.add("Obama");
		treeSet.add("Guru");
		treeSet.add("Apple");
		treeSet.add("Zara");
		treeSet.add("Pardeep");
		System.out.println(treeSet);
		// printing using Iterator.
		Iterator<String> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
