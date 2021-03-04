package com.genaro.Threads;

public class SyncTo5 extends Thread {
    private Thread t; //our thread obj ref
    private String threadName; //for our thread name
    PrintDemo PD;

    //constructor
    SyncTo5(String name, PrintDemo pd) {
        threadName = name;
        PD = pd;
        //notify that the thread has been created
        System.out.println("Creating " +  threadName );
    }

    //do work here
    public void run() {
        //notify that the thread is running
        System.out.println("Running " +  threadName );
        synchronized (PD){
            PD.printCount(threadName);
        }
        //notify when the thread is done
        System.out.println("Thread " +  threadName + " exiting.");
    }

    //start the thread
    public void start () {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName); //this is of type thread (which implements runnable)
            t.start(); //this is where start() of thread will be called
        }
    }
}
