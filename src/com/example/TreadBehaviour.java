package com.example;

//output needs clarification

class MyRunnable2 implements Runnable {
	int i =0;
	public void run() {
		
		System.out.println("in run() method");
		for (i=0 ; i < 5; i++) {
			System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
		}
		
	}
	
}

public class TreadBehaviour {

	public static void main(String... args) throws InterruptedException {

		System.out.println("In main() method");
		
		MyRunnable2 runnable = new MyRunnable2();
		//MyRunnable2 runnable2 = new MyRunnable2();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		Thread.sleep(1000);
		thread2.start();
		Thread.sleep(1000);
		System.out.println("end main() method");
		

	}

}
