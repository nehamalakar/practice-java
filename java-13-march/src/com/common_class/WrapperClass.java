package com.common_class;
/*
 * wrapper class: conversion of data from primitive to 
 * non primitive and vice a versa
 * 
 * datatype                 wrapper class
 * int                      Integer
 * float                    Float
 * 
 * Autoboxing: direct value given to the object21z.
 * `	
 * Boxing: value given to the variable to object
 * 
 * Unboxing: object to variable
 * 
 * object: root(parent) class of java by default
 */
class Demo{
	public void display() {
		
	}
	
}
public class WrapperClass {
public static void main(String[] args) {
	
	Integer i1=new Integer(10);
	System.out.println("Auto boxing is :"+i1);
	
	int i2=20;
	
	Integer i3=new Integer(i2);
	
	System.out.println("Boxing is:"+i3);
	
	int i4=i1;
	
	String s1="786";
	String s2="100";
	System.out.println(s1+s2);
	
	int i5=Integer.parseInt(s1);
	int i6=Integer.parseInt(s2);
	
	System.out.println("sum of two intger:"+(i5+i6));
	
	Demo d1=new Demo();
	d1.display();
	
	String s3=i1.toString();
	System.out.println(s3);
	
	
}
}
