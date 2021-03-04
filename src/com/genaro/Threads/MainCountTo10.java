package com.genaro.Threads;

public class MainCountTo10 { //Do I need this extends here (NO)?
    public static void main(String args[]) {
        CountTo10 c1 = new CountTo10( "Thread-1");
        c1.start(); //this start method isn't the start() from the Thread class
    }
}
