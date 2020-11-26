package com.example;


class MySleepRunnable implements Runnable {
   
	public void run() {
 
           System.out.println(Thread.currentThread().getName() + " has started");
 
           try {
                  Thread.sleep(2000);
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName() + " has ended");
 
    }
	
}
 

public class SleepDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName() + " has started");
		 
        Thread thread1 = new Thread(new MySleepRunnable(), "Thread-1");
        thread1.start();

        System.out.println(Thread.currentThread().getName() + " has ended");
	}
	
}
