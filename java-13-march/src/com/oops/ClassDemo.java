package com.oops;
/*
 * oops:
 * 1. maintainability
 * 2. modularity
 * 3. reusability
 * 4. flexibility
 *
 *
 */

class Student{
	int roll_no;
	String name;
	
	public void setData() {
		roll_no=1;
		name="neha";
		
		
	}
	public void show() {
		System.out.println("roll no is:"+roll_no );
		System.out.println("name is :"+name);
	}
	
		
	
}

public class ClassDemo {
public static void main(String[] args) {
	// class name obj_name=new Class name();
	Student s1=new Student();
	s1.setData();
	s1.show();
}
}
