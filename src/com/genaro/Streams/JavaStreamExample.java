package com.genaro.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        //You can use stream to filter, collect, print, and convert from one data structure to other etc.
        //Jasdhir used a float list, so he has to map the and transfrom the data from a product obj to a float
        //then he maps the price with the product
        //he's getting only the price from product
        //the map transforms the data
        //the map() is used to transform one object into other by applying a function.
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price >= 30000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);
    }
}
//map operation that will generate a new stream as output which will contain
//the entries that matched the condition.






