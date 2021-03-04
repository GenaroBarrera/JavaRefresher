package com.genaro.Threads;

class PrintDemo {
    public void printCount(String name) {
        try {
            for(int i = 50; i > 0; i--) {
                System.out.println(name + "   ---   "  + i );
                Thread.sleep(50);
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}
