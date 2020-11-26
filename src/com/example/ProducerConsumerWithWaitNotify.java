package com.example;

import java.util.ArrayList;

class Producer implements Runnable{
	 
    ArrayList<Integer> sharedQueue;
    
    Producer(){
           sharedQueue=new ArrayList<Integer>();
    }
    
    @Override
    public void run(){
           
           synchronized (this) {
                  for(int i=1;i<=10;i++){ //Producer will produce 10 products
                        sharedQueue.add(i);
                        System.out.println("Producer is still Producing, Produced : "+i);
                        
                        try{
                               Thread.sleep(1000);
                        }catch(InterruptedException e){e.printStackTrace();}
                  
                  }
                  System.out.println("Production is over, consumer can consume.");
                  this.notify();    //Production is over, notify consumer thread so that consumer can consume.
           }
    }
    
}
 



class Consumer extends Thread{
    Producer prod;
    
    Consumer(Producer obj){
     prod=obj;
    }
    
    public void run(){
           /*
            * consumer will wait till producer is producing.
            */
           synchronized (this.prod) {  
                  
                  System.out.println("Consumer waiting for production to get over.");
                     try{
                         //this.prod.wait();  
                    	 wait();
                        }catch(InterruptedException e){e.printStackTrace();}
                  
           }
           
           
           /*production is over, consumer will start consuming.*/
           int productSize=this.prod.sharedQueue.size();
           for(int i=0;i<productSize;i++)
                  System.out.println("Consumed : "+ this.prod.sharedQueue.remove(0) +" ");  
           
    }
    
}
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class ProducerConsumerWithWaitNotify {
   
	public static void main(String args[]) throws InterruptedException{
           
           Producer prod=new Producer();
           Consumer cons=new Consumer(prod);
           
           Thread prodThread=new Thread(prod,"prodThread");
           Thread consThread=new Thread(cons,"consThread");
           
           consThread.start();     //start consumer thread.
           Thread.sleep(100);      //This minor delay will ensure that consumer thread starts before producer thread.
           prodThread.start();     //start producer thread.
           
           
    }
 
}