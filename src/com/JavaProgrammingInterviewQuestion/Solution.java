package com.JavaProgrammingInterviewQuestion;

import static org.junit.Assert.fail;

import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Problem 1");
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);
		System.out.println(s1 == s2);
		// because there is + operator and it concadinate and this will be
		// ecuvalent like
		// "s1 == s2 is:abc" === "abc"

		System.out.println("Problem 2");
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));
		// string leaves the last index(end index)

		System.out.println("Problem 3");
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());
		/*
		 * remove(i-1), now i-1 is converted to Integer by Autoboxing and there
		 * is but there are no Integer object in the HashSet, so it will not
		 * remove anything from the HashSet and finally its size will be 100.
		 */

		System.out.println("Problem 4");
		boolean flag = true;

	/*	try {
			if (flag) {
				while (true) {
					System.out.println("hi");
					flag=false;
				}
			} else {
				System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}*/
		/**
		 * The finally block will never be reached here. If flag will be TRUE,
		 * it will go into an infinite loop and if its false its exiting the
		 * JVM. So finally block will never be reached here.
		 */

		System.out.println("Problem 5");
		String str = null;
		String str1 = "abc";
		System.out.println(str1.equals("abc")) ;
		//True
		System.out.println(str.equals(null));
		//throws nullPointerException
		System.out.println(str1.equals("abc") || str.equals(null));
		//evaulates first left, if it is true, it doesnot goes to next and returns 
		System.out.println(str1.equals("abc") | str.equals(null));
		//evalulates both and when evluating second one . it gives nullPointerException.
	}

}
