package com.string;

import java.util.Scanner;

/**
 * The challenge here is to read n lines of input until you reach EOF, then
 * number and print all n lines of content.
 * 
 * @author sameer
 *
 */
public class SpringChanlge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str; 
		int i = 1;
		while (scanner.hasNext()) {			
			str=scanner.nextLine();
			System.out.println(i + " " + str);
			i++;

		}

	}

}
