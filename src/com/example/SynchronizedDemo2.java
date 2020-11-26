package com.example;

class TicketBooking1 implements Runnable{
    int ticketsAvailable=1;
    
    public void run(){
           
           System.out.println("Waiting to book ticket for : "+Thread.currentThread().getName());
           synchronized (this) {
        	   
        	   if(ticketsAvailable>0){
                   System.out.println("Booking ticket for : "+Thread.currentThread().getName());
                   
                   
                   try{
                         Thread.sleep(1000); 
                   }catch(Exception e){}
                     
                   ticketsAvailable--;
                   System.out.println("Ticket BOOKED for : "+ Thread.currentThread().getName());
                   System.out.println("currently ticketsAvailable = "+ticketsAvailable);
            }
            
            else{
                   System.out.println("Ticket NOT BOOKED for : "+ Thread.currentThread().getName());
            }
        	   
           }
           
           
           
    }
    
}
 

public class SynchronizedDemo2 {
    public static void main(String args[])
    {
    	TicketBooking1 obj=new TicketBooking1();
           
           Thread thread1=new Thread(obj,"Passenger1 Thread");
           Thread thread2=new Thread(obj,"Passenger2 Thread");
           
           thread1.start();
           thread2.start();
           
    }
 
}
