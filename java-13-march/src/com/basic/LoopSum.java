package com.basic;
// sum of each no in 12345
public class LoopSum {
public static void main(String[] args) {
	int rem,no=12345,sum=0;
	while (no!=0) {
		rem=no%10;
		no=no/10;
		sum=sum+rem;
		
	}
	System.out.println("sum is:"+sum);
}
}
