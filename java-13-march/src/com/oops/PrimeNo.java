package com.oops;

import java.awt.desktop.AboutHandler;
import java.util.Iterator;

// how to create a function to print prime numbers between two numbers.
// input first number=10
// input second number=20
// prime numbers=11,13,15,17,19
class prime{
public  void isprime() {
int n1=10,n2=20;
	System.out.println("prime no is between:" +n1+ "and" +n2 );
}
	

}
public class PrimeNo {
public static void main(String[] args) {
	prime c1=new prime();
	int i,j, n1=10,n2=20,flag=1;
	
	 for( i=n1;i<=n2;i++) 
	 {
		 for( j=2;j<=i;j++) 
		 {
			 if (i%j==0)
				 break;
		 }
		 if(i==j)
			 System.out.println(j);
	 }
	 
}

}
