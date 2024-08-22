package com.thread;
/*
 * thread with interface
 */
import java.util.Iterator;

class second implements Runnable{

	@Override
	public void run() {
	for(int i=0; i<5; i++) {
		System.out.println(" this is second thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		
	}
	
}
public class RunnableDemo {
public static void main(String[] args) {
	second sc=new second();
	Thread t1=new Thread(sc);
	
	t1.start();
	for(int i=0; i<5; i++) {
		System.out.println(" this is main thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}	
}
}
