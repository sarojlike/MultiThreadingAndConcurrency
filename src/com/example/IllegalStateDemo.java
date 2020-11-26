package com.example;

/*
 * we cannot start Thread again, doing so will throw runtimeException java.lang.IllegalThreadStateException. 
 * The reason is once run() method is executed by Thread, it goes into dead state. 
*/
public class IllegalStateDemo implements Runnable{
    
    @Override
    public void run() {
           System.out.println("in run() method, method completed.");
    }
    
    public static void main(String[] args) {
    	IllegalStateDemo obj=new IllegalStateDemo();            
        Thread thread1=new Thread(obj,"Thread-1");
        thread1.start();
        thread1.start(); //will throw java.lang.IllegalThreadStateException at runtime
    }
 
}
 