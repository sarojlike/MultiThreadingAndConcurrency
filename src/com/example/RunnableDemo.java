package com.example;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		 System.out.println("in run() method");
		
	}
	
}
public class RunnableDemo {
	
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
	}

}
