package com.genaro.Threads;

public class TestThreadIF {
    public static void main(String args[]) {
        //ThreadDemoIF T1 = new ThreadDemoIF("Thread-1");
        //Thread R1 = new Thread(T1);
        //R1.start(T1);

        ThreadDemoIF T1 = new ThreadDemoIF( "Thread-1");
        T1.start();
        ThreadDemoIF T2 = new ThreadDemoIF( "Thread-2");
        T2.start();
    }
}
