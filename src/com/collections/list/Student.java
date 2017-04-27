package com.collections.list;

import java.util.ArrayList;

public class Student {
	int rollnum;
	String name;
	int age;
	
	public Student(int rollnum, String name, int age) {
		this.rollnum = rollnum;
		this.name = name;
		this.age = age;
	}



	public static void main(String[] args) {
		// Creating user-defined class objects
		Student s1=new Student(101,"Sophia",23);
		Student s2=new Student(102,"Aran",21);
		Student s3=new Student(103,"Mason",24);
		ArrayList<Student> aList=new ArrayList<>();
		aList.add(s1);
		aList.add(s2);

		aList.add(s3);

		for(Student s:aList){
			System.out.println(s.rollnum+" "+s.name+" "+s.age);
		}
	}

}
