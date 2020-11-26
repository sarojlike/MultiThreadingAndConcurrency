package com.example;

public class SleepDemo1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " has started");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " has ended");
	}
	
}
