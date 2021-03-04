package com.genaro.Threads;

public class CountTo10 extends Thread{
    private Thread t; //our thread obj ref
    private String threadName; //for our thread name

    //constructor
    CountTo10(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    //do work here
    public void run() {
        //notify that the thread is running
        System.out.println("Running " +  threadName );
        try { //whenever you sleep a thread it will the interrupted exception
            //iterate from 1 to 10
            for(int i = 1; i <= 10; i++) {
                //print the thread and the count
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while. (how will this affect our count?)
                Thread.sleep(50); //in milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        //notify when the thread is done
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName); //this is of type thread (which implements runnable)
            t.start(); //this is where start() of thread will be called
        }
    }
}
