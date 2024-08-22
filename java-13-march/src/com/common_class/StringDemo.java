package com.common_class;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/*
 * string : immutable: can not change the value
 * stringBuffer
 * wrapper
 * object
 */
public class StringDemo {
public static void main(String[] args) {
	String s1="This is Tops tech...";
	
	System.out.println("original string is:" +s1);
	System.out.println("length of  string is: "+s1.length());
	System.out.println("to upper case string is: "+s1.toUpperCase());
	System.out.println("to lower cae string is: "+s1.toLowerCase());
	System.out.println("substring is: "+s1.substring(2));
	System.out.println("substring is: "+s1.substring(2,5));
	System.out.println("char at :"+s1.charAt(0));
	
	
	if (s1.equalsIgnoreCase("this is tops tech")) {
		System.out.println("both string are same");
	}else {
		System.out.println("both string are different");
	}
	System.out.println("original string is:" +s1);
	System.out.println("length of  string is: "+s1.length());
	
}
}
