package com.basic;

public class FirstDemo {
public static void main(String[] args) {
	int i1=2147483647;
	long  l1=12345678912341l;
	boolean b1=true;
	char ch='a';
	byte bt=127;
	float f1=3434.3423f;
	double d1=34253.6655442233;
	
	
	System.out.println("Integer value is:"+i1);
	System.out.println("Long value is:"+l1);
	System.out.println("Boolean value is:"+b1);
	System.out.println("Ch value is:"+ch);
	System.out.println("byte value is:"+bt);
	System.out.println("Float value is:"+f1);
	System.out.println("Double value is:"+d1);
	
	System.out.println("\n");
	System.out.println("Size of Integer is:"+Integer.BYTES+" Bytes");
	System.out.println("Size of Long is:"+Long.BYTES+" Bytes");
	System.out.println("Size of Char is:"+Character.BYTES+" Bytes");
	System.out.println("Size of Byte is:"+Byte.BYTES+" Bytes");
	System.out.println("Size of Float is:"+Float.BYTES+" Bytes");
	System.out.println("Size of double is:"+Double.BYTES+" Bytes");
}
}
