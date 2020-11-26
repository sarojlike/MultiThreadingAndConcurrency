package com.example;

class Mythread1 extends Thread{
	
	public void run() {
		
		System.out.println("in run() method");
		System.out.println(Thread.currentThread().getName());
		
	}
}

public class ThradDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("inside main method");
		System.out.println(Thread.currentThread().getName());
		Mythread1 mythread = new Mythread1();
		mythread.start();
	}
	

}
