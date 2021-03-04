package com.genaro.CollectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        List<String> arrList=new ArrayList<String>(); //make sure you specify String using generics
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        arrList.add("E");

        for(String a:arrList) //make sure you specify String using generics
            System.out.println(a);

        Iterator<String> itr=arrList.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
