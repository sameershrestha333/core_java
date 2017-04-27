package com.string;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First String :");
		String str1 = scan.nextLine();
		System.out.println("Enter Second String :");
		String str2 = scan.nextLine();
		System.out.println("The sum of the string is :" + (str1.length() + str2.length()));

		if (str1.compareTo(str2) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(str1.substring(0, 1).toUpperCase() + str1.substring(1) + " "
				+ str2.substring(0, 1).toUpperCase() + str2.substring(1));
	}

	public static void main(String[] args) {
		new JavaStringsIntroduction().test();
	}

}
