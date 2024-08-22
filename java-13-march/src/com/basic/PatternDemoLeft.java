package com.basic;
//    1
//   12
//  123
// 1234
//12345


//    *
//   ***
//  *****
//   ***
//    *
import java.util.Iterator;

//     1
//    1 2
//   1  2 3
// 1  2  3  4
//1  2  3  4   5

//    A
//   A  B
//  A  B  C
// A  B  C D

//    *
//  * * *
//* * * * *
// * * *
//  *

public class PatternDemoLeft {
public static void main(String[] args) {
//	char k=1;
	for(int  i=1; i<=5; i++) {
		for(int k=i;k<=5; k++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print(j);
			
		}
		System.out.println();
	}
	for(int i=1; i<=5; i++) {
		for(int k=i;k<=5; k++) {
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print(" "+j);
			
		}
		System.out.println();
	}
	char i,j,A,D,k;
	for ( i='A'; i<='D'; i++){
		for( k=i; k<='D'; k++) {
			System.out.print(" ");
			
		}
		for( j='A';j<=i; j++) {
			System.out.print(" "+j);
		}
		System.out.println();
	}
	
	for(int i=1; i<=3; i--) {
		for(int k=1; k<=3; k++) {
			System.out.print(" ");		
			{	
		for(int j=1*2-1; j>=1; j--) {
			System.out.print("*");
		}
	         System.out.println( );
		}	
}
}
