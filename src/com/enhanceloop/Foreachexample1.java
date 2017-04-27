package com.enhanceloop;

/**
 * Program to use enhanced for loop example in java.
 * 
 * @author sameer
 *
 */

public class Foreachexample1 {

	public static void main(String[] args) {
		int[] myArr = { 3, 1, 2, 4 };
		for (int i : myArr) {
			System.out.print(i+" ");
		}
		
		int sum=0;
		for(int i:myArr){
			sum+=i;
		}
		System.out.println("Sum is "+ sum);
	}

}
