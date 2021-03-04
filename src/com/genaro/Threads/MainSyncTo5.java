package com.genaro.Threads;

public class MainSyncTo5 {
    public static void main(String[] args) {
        PrintDemo PD = new PrintDemo();

        SyncTo5 S1 = new SyncTo5( "Thread - 1 ", PD);
        SyncTo5 S2 = new SyncTo5( "Thread - 2 ", PD);

        S1.start();
        S2.start();
        // wait for threads to end
        try {
            S1.join();
            S2.join();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
    }
}
