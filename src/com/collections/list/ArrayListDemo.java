package com.collections.list;

import java.util.ArrayList;

public class ArrayListDemo {


	public void simpleTest(){
		ArrayList<String> aList=new ArrayList<String>();
		aList.add("Sophia");
		aList.add("Olivia");
		aList.add("Ava");
		aList.add("Jacob");
		aList.add("Mason");
		/*for(String obj: aList){
			System.out.println(obj);
		}*/
		aList.forEach(System.out::println);
	}
	public static void main(String[] args) {
		ArrayListDemo obj=new ArrayListDemo();
		obj.simpleTest();
		
	}

}
