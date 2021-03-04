package com.genaro.Lamdas;

public interface SaySomething {
    //takes in no param
    //public String say();

    //takes in a single param
    //Note a functional interface can only have one abstract method for lambdas
    //research this some more
    //public String sayName(String name);

    //takes in 3 params
    public String sayAlot(String name, String birthDate, int age);
}
