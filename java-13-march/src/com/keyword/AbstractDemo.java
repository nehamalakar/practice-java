package com.keyword;
/*keyword:
 * Abstract
 * super
 * final
 * this
 * static
 * interface
 * 
 * Abstraction: details are hidden only essential info is shown 
 * use  with class:
 * 1. we can not create of object of abstract class
 * 2. must inherit into some other
 * 
 * use with method:
 * abstract can not be defined (can not have method body)
 * must implement in to child class
 * abstract method must have abstract class 
 * 
 */
abstract class ADemo{
	int roll_no;
	String name;

public void setData() {
	roll_no=12;
	name="Neha";
}
public abstract void show();

}
class Demo extends ADemo{
	
	@Override
	public void show() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is:"+name);
	}
}
public class AbstractDemo {
public static void main(String[] args) {
	Demo ad=new Demo();
	ad.setData();
	ad.show();
}
}
