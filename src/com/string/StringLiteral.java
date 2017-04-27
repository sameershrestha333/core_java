package com.string;

public class StringLiteral {

	public static void main(String[] args) {

		String str1 = "james";
		String str2 = "james";
		String str3 = new String("james");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

		/*final String string = "sameer";
		string = "shresta";*/

	}

}
