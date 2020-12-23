package com.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class ProducerBlockinqQue implements Runnable {
 
    private  BlockingQueue<Integer> sharedQueue;
 
    public ProducerBlockinqQue(BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
   

	@Override
    public void run() {
        for(int i=1; i<=10; i++){
         try {
             System.out.println("Produced : " + i);
             //put/produce into sharedQueue.
             sharedQueue.put(i);          
         } catch (InterruptedException ex) {
             
         }
        }
    }
 
}
 
/**
 * Consumer Class in java.
 */
class ConsumerBlockingQueue implements Runnable{
 
    private BlockingQueue<Integer> sharedQueue;
 
    public ConsumerBlockingQueue (BlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
 
  

	@Override
    public void run() {
        while(true){
         try {
           //take/consume from sharedQueue.
             System.out.println("CONSUMED : "+ sharedQueue.take());  
         } catch (InterruptedException ex) {
             
         }
        }
    }
 
 
}
 

public class ProducerConsumerBlockingQueue {
 
    public static void main(String args[]){
     
     //Creating shared object  
     BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
    
     ProducerBlockinqQue producer=new ProducerBlockinqQue(sharedQueue);
     ConsumerBlockingQueue consumer=new ConsumerBlockingQueue(sharedQueue);
    
     Thread producerThread = new Thread(producer, "ProducerThread");
     Thread consumerThread = new Thread(consumer, "ConsumerThread");
     producerThread.start();
     consumerThread.start();
 
    }
 
}
 