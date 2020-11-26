package com.example;


class MySleepRunnable1 implements Runnable {
   
	public void run() {
 
		 System.out.println(Thread.currentThread().getName() + " has started");
         try {
                Thread.sleep(1000); 
         } catch (InterruptedException e) {
                e.printStackTrace();
         }
         System.out.println(Thread.currentThread().getName() + " has ended");

 
    }
	
}
 

public class SleepDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		  System.out.println(Thread.currentThread().getName() + " has started");
		  
          Thread thread1 = new Thread(new MySleepRunnable1(), "Thread-1");
          thread1.start();
          thread1.sleep(10000); //we will face warning - The static method 
                    //sleep(long) from the type Thread should be accessed in a static way

          System.out.println(Thread.currentThread().getName() + " has ended");
	}
	
}
