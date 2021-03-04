package com.genaro.CollectionAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapByValue {
    //sort function sort hash map by values
    public static void sortHMByValue(HashMap<String, Integer> hm){
        //we can't sort maps themselves, so place the map entries in a list, and sort the list itself
        //from hm.entrySet() create a stream of the map entries by calling .stream()
        //then call .sorted() on the created stream passing in Map.Entry.comparingByValue (sorted() takes in a comparator which is provided by Map.Entry.comparingByValue)
        //then chain in .collect() to collect the stream of elements to a collections using the Collector's class .toList() method
        //Java Stream collect() is mostly used to collect the stream elements to a collection. It’s a terminal operation.
        /**
         * A lot of this is new to me, I should research more stream examples so that I can get more familiar
         * I also need to look more into functional programming and chaining functions, (is that what you call it)
         */
        List<Map.Entry<String,Integer>> sorted = hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        //print the sorted list using method referencing
        sorted.forEach(System.out::println);
    }

    public static void main(String[] args) {
        //create a new hashmap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        //add Exams with grades
        hm.put("Math",73);
        hm.put("English",84);
        hm.put("History",98);
        hm.put("Biology",64);

        //print the hashmap
        sortHMByValue(hm);
    }
}
