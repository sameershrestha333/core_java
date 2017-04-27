package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

	static boolean isAnagram(String str1, String str2) {
		char[] words1 = str1.toLowerCase().replaceAll("[\\s]", "") .toCharArray();
		char[] words2 = str2.toLowerCase().replaceAll("[\\s]", "") .toCharArray();
		Arrays.sort(words1);
		Arrays.sort(words2);
		return Arrays.equals(words1, words2);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1=scanner.nextLine();
		String str2=scanner.nextLine();
		boolean result=isAnagram(str1, str2);
		if(result) 
			System.out.println("Anagrams");
		else {
			System.out.println("Not Anagrams");
		}
	}

}
