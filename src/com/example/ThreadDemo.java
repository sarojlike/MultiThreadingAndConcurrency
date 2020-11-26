package com.example;

class Mythread extends Thread{
	public void run() {
		System.out.println("in run() method");
        System.out.println("currentThreadName= "+ Thread.currentThread().getName());
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		
		Mythread mythread = new Mythread();
		mythread.start();
		
	}
}
