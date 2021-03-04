package com.genaro.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CassieStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        //Explain who this solutions works!
        //lambda function? where's the interface? Streams api has a built in functional interface it seems
        //She places the products in a new list cheapest,
        //by using manipulating the original productsList and using stream().filter to remove products with prices over 30,000
        //she uses .collect(Collectors.toList()); to add the filtered products to the cheapest list
        //then she uses a for each loop iterate and print the prices of the products inside the cheapest list
        //Note: (Streams leverage functional interfaces)
        List<Product> cheapest = productsList.stream().filter(x -> x.price<30000).collect(Collectors.toList());
        for(Product p: cheapest){
            System.out.println(p.price);
        }
    }
}
