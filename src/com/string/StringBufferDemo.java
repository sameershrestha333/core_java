package com.string;

import java.io.File;

/**
 * This program is used to show the use of String Buffer
 * @author sameer
 *
 */
public class StringBufferDemo {
	
	
	 StringBuffer sb=new StringBuffer("Hello ");
	 /**
	  * This method is used to append or add string at last
	  */
	 public void appendTest(){
		 System.out.println(sb.append("Sameer"));
	 }
	 
	 public void replaceTest(){
		 System.out.println(sb.replace(0, 1, "sam"));
	 }

	 public void reverseTest(){
		 System.out.println(sb.reverse());
	 }
	public static void main(String[] args) {
		StringBufferDemo obj=new StringBufferDemo();
		obj.appendTest();
		obj.replaceTest();
		obj.reverseTest();
	}

}
