package com.exception;
/*
 * Exception: abnormal condition occur
 * it is a class
 * Exception class is a root class for all exception
 * 1. compile time exception:
 * syntax error, ;,} missing
 * 2. runtime exception:
 *      Arithmetic exception, ArrayIndexoutofBound
 * 3. error: developer mistake
 *  
 *  keywords:
 *      try:
 *      if u have a doubt that error might come in some code
 *      keep that code inside try block
 *      2. it will skip the code which has error and execute the remaining code
 *      3.try block will throw to catch block and error handle by catch block
 *      4. try followed by catch or finally or both 
 *      catch: 
 *      1. whenever any error throw by try block it will handle the error
 *      2. there can be multiple catch
 *                                                                          
 *      
 *      finally: whether error is there or not finally clock will be executed
 *      throw
 *      throws
 *      
 *      
 *      
 */
public class ExceptionDemo {
public static void main(String[] args) {
	int a=12, b=0;
	int[]c=new int[3];
	try {
		System.out.println("div is:"+(a/b));
		for(int i=0; i<c.length; i++) {
			c[i]=i+1;
			System.out.println(c[i]);
		}
	} catch (ArithmeticException e) {
		e.printStackTrace();
	}
	 
	 finally {	
	
	 System.out.println("this code is written by neha");
	 System.out.println("contact 9542365100");
}
}
}