package com.example;

/*if we override start() method, run() method will not be called even after calling 
run method from start method will behave like simple mthod call not a thread execution
*/
class ThreadOverRidingStart extends Thread {
	 
    
   
    private int i = 0;
    @Override
	public void run() {
    	System.out.println("in run() method");
		for (i=0 ; i < 5; i++) {
			System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
		}
	}
    
    
    @Override
    public void start(){
           System.out.println("In start() method");
           run();
    }
    
}


public class OverrideStartMethod {
    public static void main(String[] args) {
           System.out.println("main has started.");
           
           ThreadOverRidingStart thread1=new ThreadOverRidingStart();
           ThreadOverRidingStart thread2=new ThreadOverRidingStart();
           thread1.start();
           thread2.start();
           
           System.out.println("main has ended.");
    }
 
}
 