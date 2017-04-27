package com.corejava.basic;

/**
 * This program is used to print alphabets both in small and capital.
 * @author sameer
 *
 */

public class PrintAlphabets {

	public static void main(String[] args) throws InterruptedException {
		char ch;
		System.out.println("Small Alphabets");
		for(ch='a';ch<='z';ch++ ){
			System.out.println(ch);
			Thread.sleep(100);
		}
		System.out.println("Capital Alphabets");
		for(ch='A';ch<='Z';ch++ ){
			System.out.println(ch);
			Thread.sleep(100);
		}
		
		
	}
}
