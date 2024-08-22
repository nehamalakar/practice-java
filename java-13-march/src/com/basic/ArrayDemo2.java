package com.basic;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 2D array:
 * collection of row and colum
 * a[row][colum]
 */
public class ArrayDemo2 {
public static void main(String[] args) {
	int[][]a=new int[2][2];
	
	Scanner sc=new Scanner(System.in);
	
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			System.out.println("enter value for a["+i+"]["+j+"]:");
			a[i][j]=sc.nextInt();
		}
	}
	int[][]b=new int[2][2];	
	int[][]c=new int[2][2];
	
	for(int i=0; i<b.length; i++) {
		for(int j=0; j<b[i].length; j++) {
			System.out.println("enter value for b["+i+"]["+j+"]:");
			b[i][j]=sc.nextInt();
		}
	}
	
	
	System.out.println();
	System.out.println("sum of two array:");
	for(int i=0; i<c.length; i++) {
		for(int j=0; j<c[i].length; j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.println(" "+c[i][j]+" ");

		}
		System.out.println("");
	}
	
}

}
