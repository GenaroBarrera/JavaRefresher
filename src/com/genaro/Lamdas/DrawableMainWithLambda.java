package com.genaro.Lamdas;

//This example does the same but with a lambda expression
public class DrawableMainWithLambda {
    public static void main(String[] args) {
        /**     Important characteristics of lambda expressions
         *  Optional type declaration − No need to declare the type of a parameter.
         *  The compiler can inference the same from the value of the parameter.
         *
         *  Optional parenthesis around parameter − No need to declare a single parameter in parenthesis.
         *  For multiple parameters, parentheses are required.
         *
         *  Optional curly braces − No need to use curly braces in expression body
         *  if the body contains a single statement.
         *
         *  Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value.
         *  Curly braces are required to indicate that expression returns a value.
         */
        //lambda expression syntax
        //(argument-list) -> {body};
        int width=12;
        Drawable d2 = (x) -> { System.out.println("Drawing "+x);
        };
        d2.draw(width);
        System.out.println(d2.getClass());
    }
}
