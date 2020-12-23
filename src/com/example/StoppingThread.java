package com.example;

import java.util.Scanner;

class MyRunnableStop implements Runnable {
    
    boolean continueThread=true;
    
    public void run() {
           int i = 0;
           while (true)
 
                  if (continueThread) {
                        try {
                               System.out.println(i++);
                               Thread.sleep(1000);
                               System.out.println("Please press enter key to stop "
                                         +Thread.currentThread().getName());
                        } catch (InterruptedException e) {
                               e.printStackTrace();
                        }
                  } else{
                        System.out.println(Thread.currentThread().getName()+" ENDED");
                        break;
                  }
    }
 
}
 



public class StoppingThread {
	
	public static void main(String args[]) throws Exception {
		 
		MyRunnableStop obj = new MyRunnableStop();
        Thread t = new Thread(obj,"Thread-1");
        t.start();

        System.out.println(Thread.currentThread().getName()
                 +" thread waiting for user to press enter");
        
        int read = System.in.read();
       // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
       // System.out.println("Enter username");

        //String userName = myObj.nextLine();
        System.out.println(read);
        obj.continueThread = false; 

        System.out.println(Thread.currentThread().getName()+" thread ENDED");

 }
	

}
