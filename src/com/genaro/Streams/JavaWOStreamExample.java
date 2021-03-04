package com.genaro.Streams;

import java.util.ArrayList;
import java.util.List;

public class JavaWOStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        List<Float> productPriceList = new ArrayList<Float>();
        for(Product product: productsList){
            // filtering data of list to only show products with a price below 30000
            if(product.price<30000){
                productPriceList.add(product.price);    // adding price to a productPriceList
            }
        }
        System.out.println(productPriceList);   // displaying data
    }
}
