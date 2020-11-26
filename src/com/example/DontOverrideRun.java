package com.example;

/*
 * When we call start() method on thread, it internally calls run() method with newly created thread. 
 * So, if we don’t override run() method newly created thread won’t be called and nothing will happen.
*/
class ThreadWithoutRun extends Thread {
    //don't override run() method
}
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class DontOverrideRun {
    public static void main(String[] args) {
           System.out.println("main has started.");
           ThreadWithoutRun thread=new ThreadWithoutRun();
           thread.start();
           System.out.println("main has ended.");
    }
 
}