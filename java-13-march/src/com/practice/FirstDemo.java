package com.practice;

import java.util.PrimitiveIterator.OfDouble;

import javax.print.attribute.Size2DSyntax;

public class FirstDemo {
public static void main(String[] args) {
	int i1=2147483647;
	long l1= 12345678912341l;
	boolean b1=true;
	char ch='a';
	byte bt=127;
	float f1=3434.3423f;
	double d1=34253.6655442233;
	
	System.out.println("Integer value is :"+i1);
	System.out.println("Long value is:"+l1);
	System.out.println("Boolean value is:"+b1);
	System.out.println("ch value is:"+ch);
	System.out.println("byte value is:"+bt);
	System.out.println("Float value is:"+f1);
	System.out.println("Double value is:"+d1);
	
	System.out.println("/n");
	System.out.println("Size of integer is:"+Integer.BYTES+"Bytes");
	System.out.println("Size of long is:"+Long.BYTES+"Bytes");
	System.out.println("Size Of char is:"+Character.BYTES+"bytes");
	System.out.println("Size of Byte is:"+Byte.BYTES+"Bytes");
	System.out.println("Size of Float is:"+Float.BYTES+"Bytes");
	System.out.println("Size og Double is:"+Double.BYTES+"Bytes");
	
}
}
