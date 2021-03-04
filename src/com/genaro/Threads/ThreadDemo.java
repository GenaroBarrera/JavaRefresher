package com.genaro.Threads;

public class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;
    ThreadDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }
    public void run() {
        System.out.println("Running " +  threadName );
        try { //whenever you sleep a thread it will the interrupted exception
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50); //in milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }
//    public void start () { //note: you can comment this method out and it would still work bc thread has start() parent method
//        System.out.println("Starting " + threadName);
//        if (t == null) {
//            t = new Thread(this, threadName); //this is of type thread (which implements runnable)
//            t.start(); //this is where start() of thread will be called
//        }
//    }
}
