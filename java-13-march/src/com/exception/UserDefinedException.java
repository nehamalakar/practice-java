package com.exception;

import java.util.Scanner;

/*
 * throw:
 * 1.must use for user defined exception
 * 2.must inherit exception class to make a class user defined exception class
 * 3.throw must followed by"new"keyword and constructor
 * 4.written inside method
 * 
 * throws:
 * 1.written at method declaration
 * 2. can use user defined as well as system exception
 * separated by,
 * 3. we can throw multiple exception class by using.
 * ATM
 * deposit:
 * withdraw:
 * 2000
 * 10000
 * insufficient balance
 * 
 * if you deposit 3000rs more you can withdraw 5000rs
 * 
 * 
 */
class TanviException extends Exception{
	double amount;//instance/global/class
	public  TanviException(double amount) {
		this.amount=amount;
	
		
	}
}
class ATM{
	double balance;
	
	public void deposite(double amount) {
		balance+=amount;//short hand operator
	//	balance=balance+amount;
		System.out.println("you have deposited "+balance+"rs");
		
		
	}
	public void withdraw(double amount)throws TanviException,ArithmeticException {
		if(balance>=amount) {
			balance-=amount;
			balance=balance-amount;
			System.out.println("you have withdrawn "+amount+"rs"+"\nremaining balance is:"+balance+"rs");
		}else {
			double needs=amount-balance;//5000-2000
			throw new TanviException(needs);
			
		}
	}
}
public class UserDefinedException {
public static void main(String[] args) {
	double amount;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the amount to be deposited: ");
	amount=sc.nextDouble();
	ATM atm=new ATM();
	atm.deposite(amount);
	System.out.println("enter the amount to be withdraw: ");
	amount=sc.nextDouble();
	try {
		atm.withdraw(amount);
	} catch (TanviException e) {
		System.out.println("if you deposite "+e.amount+"rs more you can withdraw "+amount+"rs");
	}
}
}
