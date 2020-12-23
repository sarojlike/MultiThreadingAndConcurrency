package com.example;

class RunnableJoin implements Runnable{
    public void run(){
        System.out.println("in run() method");
           for(int i=0;i<5;i++){
                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
           }          
    }
}
 


public class JoinDemo {
	
	 public static void main(String...args) throws InterruptedException{
         System.out.println("In main() method");
         
         RunnableJoin runnable=new RunnableJoin();
         
         Thread thread1=new Thread(runnable);
         Thread thread2=new Thread(runnable);

         thread1.start();
         thread1.join();

         thread2.start();
         thread2.join();

         System.out.println("end main() method");
  }
	

}
