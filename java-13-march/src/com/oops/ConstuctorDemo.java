package com.oops;
/*
 * constructor: it is special member function which is 
 * initialized by its own
 * 1. same name as class name
 * 2. no return type
 * 3. automatically invoked whenever object its created
 * 
 * types of constructor
 * 1. default : without parameter
 * 2. parameterized: with parameter
 * 3. copy: object as a parameter
 * 
 */
 class Box{
	 double length,width,height;
	 
	 // 1.default :without parameter
	 public Box() {
		 System.out.println("in default constructor");
		 length=1;
		 width=2;
		 height=3;
		 
		
	}
	 public Box(double l,double w, double h) {
		 System.out.println("in parameterized constructor");
		 length=l;
		 width=w;
		 height=h;
		
	}
	 public Box (Box b) {
		System.out.println("in copy constuctor");
		length=b.length;
		width=b.width;
		height=b.height;
	}
	 
	 public void volofBox() {
		System.out.println("volume of box:"+(length*width*height));
	}
	 
 }

public class ConstuctorDemo {
public static void main(String[] args) {
	Box b1=new Box();
	b1.volofBox();
	Box b2=new Box(10,20,30);
	b2.volofBox();
	Box b3=new Box(b2);
	b3.volofBox();
	
}
}
