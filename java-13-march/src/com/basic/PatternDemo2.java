package com.basic;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * for i:
 * initialization:
 * first no of pattern
 * 
 * condition:
 * last no of pattern
 * 
 * increement/decreement
 * smaller to bigger no : ++, <=
 * bigger to smaller no : --,>=
 * 
 * for j:
 * initialization
 * first colum of each row
 * same no: that number only
 * different no: uper loop name
 * 
 * conditon
 * last colum of each row
 * same no: that number only
 * different no: upper loop name
 * 
 * 5
 * 54
 * 543
 * 5432
 * 54321
 * 
 */
public class PatternDemo2 {
public static void main(String[] args) {
	for(int i=5; i>=1; i--) {
		for(int j=5; j>=i;j--){
			System.out.print(j);
		}
		System.out.println();
	}
	
}
}
