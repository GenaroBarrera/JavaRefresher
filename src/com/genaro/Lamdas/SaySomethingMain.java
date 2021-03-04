package com.genaro.Lamdas;

public class SaySomethingMain {
    public static void main(String[] args) {
        //Note: we didn't have to implement say() in a class?
        //research this some more

        //This is no param lambda expression
        //SaySomething s = () -> "Hello, This is no param lambda expression";
        //System.out.println(s.say());

        //now we need to add a new abstract method to the interface
        // that takes in a single parameter
        //SaySomething s = (name) -> "Hello, " + name;
        //System.out.println(s.sayName("Genaro"));

        //takes in 3 params
        SaySomething s = (name, birthDate, age) -> "Hello, My name is " + name +
                " \nI was born on " + birthDate +
                " \nand my age is " + age;
        System.out.println(s.sayAlot("Genaro", "09/11/1995", 25));
    }
}
