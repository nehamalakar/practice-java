package com.basic;
/*
 * type casting : to convert one primitive type to another
 * 
 * 1. implicit: auto conversion
 * from smaller data type to bigger
 * int to long
 * 
 * 2. explicit:
 * from bigger to smaller
 * long to int
 * 
 */
public class TypeCastingDemo {
public static void main(String[] args) {
	int i1=10;
	long l1=i1;
	System.out.println("implicit conversion is:"+i1);
	
	int i2=(int)l1;
	System.out.println("explicit conversion is:"+i2);
	
	char ch='Y';
	int i3=ch;
	System.out.println("implicit conversion is:"+i3);
	
	int i4=512;
	byte b1=(byte)i4; //-128,-127,-126 to 127
	//128
	System.out.println("explicit conversion is:"+b1);
	
	
	
		
}
}
