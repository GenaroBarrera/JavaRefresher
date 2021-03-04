package com.genaro.Lamdas;

public class MathLambdaMain {
    public static void main(String[] args) {
        MathLambda m = (x, y, op)->{ if(op== "add") return (x+y);
            else if(op== "sub") return (x-y);
            else if(op=="mul") return (x*y);
            else if (op=="div") return (x/y);
            else return 0;
        };

        System.out.println(m.mathOps(10, 5, "add"));
        System.out.println(m.mathOps(10, 5, "sub"));
        System.out.println(m.mathOps(10, 5, "mul"));
        System.out.println(m.mathOps(10, 5, "div"));
    }
}
