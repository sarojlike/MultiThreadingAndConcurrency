package com.example;

public class SynchronizeDemo {
	
static int x = 0, y = 0;
    
	static  synchronized  void method1() {
    	System.out.println("inside method1()");
           x++; y++;
    }

	static  synchronized  void method2() {
    	System.out.println("inside method2()");
           System.out.println("x=" + x + " y=" + y);
    }
    
    public static void main(String[] args) throws InterruptedException {
           Thread thread1=new Thread(){
                  public void run(){
                        for(int i=0; i<10;i++)
                               method1();
                        
                  }
           };
 
           Thread thread2=new Thread(){
                  public void run(){
                        for(int i=0; i<10;i++)
                               method2();
                        
                  }
           };
           
           thread1.start();
           Thread.sleep(1000);
           thread2.start();
    }

}
