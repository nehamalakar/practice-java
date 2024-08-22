package com.keyword;
/*
 * interface:
 * 1. we cannot create the object of interface we can the reference
 * 2. only data member and member function are allowed
 * 3. all the data member are final be default
 * 4. all the member functions are abstract by default
 * 5. we are use all the properties of interface in any user defined
 * class by using "implements"keyword
 * 6.pure data hiding
 * 7.main purpose is to resolve issue of multiple inheritance
 */
class Result{
	String grade;
	public void setResult() {
		grade="A+";
		
		
	}
}
class Staff extends Result  implements Student,IDemo  {

	@Override
	public void show() {
            System.out.println("s no is..."+s_no);
		    System.out.println("grade is..."+grade);
		    System.out.println("i is..."+i);
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	Staff s1=new Staff();
	s1.setResult();
	s1.show();
	
}
}
