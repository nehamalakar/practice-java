package com.keyword;
/*
 * Final : constant at value side
 * use with variable:
 * 1. value must be define at the time of declaration
 * 2. value can not be changed at run time as well as at compile
 * 
 * use with method: opposite of abstract method
 * use with class: opposite of abstract class
 * 
 */
  class FDemo{
	final int  roll_no=12;
	String name;
	
	public final void setData() {
		name="Neha";
		
	}
	public void show() {
		System.out.println("roll no is:"+roll_no );
		System.out.println("name is:"+name);
	}
	
}
class Demo extends FDemo{
	
}
public class FinalDemo {
public static void main(String[] args) {
	FDemo f1=new FDemo();
	f1.setData();
	f1.show();
}
}
