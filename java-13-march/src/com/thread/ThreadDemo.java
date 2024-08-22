package com.thread;

import java.util.Iterator;

/*
 * Thread:
 * simple light weight process
 * 
 * main is a thread
 * single thread:
 * 
 * multi thread /multi processing / multi tasking
 * 
 * thread life cycle:
 * 1.newborn
 * 2.runnable
 * 3.running
 * 4.blocked
 * 5.dead
 * 
 */
class FirstDemo extends Thread{
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("this is first thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
}
public class ThreadDemo {
public static void main(String[] args) {
	FirstDemo fDemo=new FirstDemo();
	fDemo.start();
	
	for(int i=0; i<5; i++) {
		System.out.println("this is main thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();

}
}
}
}
