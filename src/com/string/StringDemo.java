package com.string;

/**
 * This program is used to show the use of String Buffer
 * @author sameer
 *
 */
public class StringDemo {
	
	 String str="Hello ";
	 
	 public void concatTest(){
		 System.out.println(str.concat("Sameer"));
	 }

	public static void main(String[] args) {
		StringDemo obj=new StringDemo();
		obj.concatTest();
	}

}
