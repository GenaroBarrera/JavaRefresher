package com.genaro.Lamdas;

/**
 * Default methods enable us to add new functionality to existing interfaces without
 * breaking older implementation of these interfaces.
 */
public class DefaultMethods2 implements Sayable2{
    public void sayMore(String msg){     // implementing abstract method
        System.out.println(msg);
    }
    public static void main(String[] args) {
        DefaultMethods2 dm = new DefaultMethods2(); //original line was just DefaultMethods
        dm.say();                       // calling default method
        dm.sayMore("Work is worship");      // calling abstract method
        Sayable2.sayLouder("Helloooo...");   // calling static method
    }
}
