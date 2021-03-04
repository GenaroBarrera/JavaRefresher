package com.genaro.Threads;

//re running the program will give a different output each time
public class TestThread extends Thread{
    public static void main(String args[]) {
        ThreadDemo T1 = new ThreadDemo( "Thread-1");
        T1.start(); //this start method isn't the start() from the Thread class
        ThreadDemo T2 = new ThreadDemo( "Thread-2");
        T2.start();
    }
}
