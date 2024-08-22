package com.oops;
/*
 * Hierarchical: one parent multiple child
 * 
 * 
 */
class parent{
	String p_name;
	long ph_no;
	
	public void setParent() {
		p_name="ankit tiwari";
		ph_no=8523568910l;
		
		
	}
}
class child1 extends parent{
	String name ="anil";
	public void show() {
		System.out.println("for any complain of:"+name+"  "+p_name+" call"+ph_no);
		
	}
	
}
class child2 extends parent{
	String name =" rohit";
	public void show() {
		System.out.println("for any complain of:"+name+"  "+p_name+"call"+ph_no);
		
	}
}
public class HirerarchicalDemo2 {
public static void main(String[] args) {
	child1 c1=new child1();
	c1.setParent();
	c1.show();
	
	child2 c2=new child2();
	c2.setParent();
	c2.show();
	 
}
}
