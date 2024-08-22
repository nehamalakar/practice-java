package com.basic;

import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

/*
 * Array: collection of data of similar type
 * 1 D Array
 * always start with index 0
 * size-1
 * if size is greater than assigned size it gives error
 * ArrayIndexoutofBoundExeption
 * 2 D Array
 * jagged Array
 * 
 * 1 D array
 */
public class ArreyDemo {
public static void main(String[] args) {
	
	// roll no 5 students
	// declaration of arrays
	int[]a= {1,2,3,4};
	//Initialization of array
	int[]b=new int[5];
	
	Scanner sc=new Scanner(System.in);
	for(int i=0; i<b.length; i++) {
		System.out.println("enter of value");
		b[i]=sc.nextInt();
	}
		System.out.println("enterd value");
		for(int i=0; i<b.length; i++) {
			
			System.out.println((b[i]));
	}
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	
}
}
