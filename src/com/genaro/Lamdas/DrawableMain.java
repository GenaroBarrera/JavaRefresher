package com.genaro.Lamdas;

//this is an example without a lambda expression
public class DrawableMain {
    public static void main(String[] args) {
        int width=10;
        Drawable d = new DrawableClass();
        d.draw(width);
        System.out.println(d.getClass());

        //how to use lambda/functional programming using method referencing
        Drawable test = new DrawableClass()::draw;
        test.draw(width);
        System.out.println(test.getClass());

    }
}