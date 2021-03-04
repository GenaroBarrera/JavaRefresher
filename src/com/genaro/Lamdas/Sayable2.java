package com.genaro.Lamdas;

/**
 * Default methods enable us to add new functionality to existing interfaces without
 * breaking older implementation of these interfaces.
 */
interface Sayable2{
    // default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
    // static method
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}
