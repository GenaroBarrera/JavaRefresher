package com.genaro.CollectionAPI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Assignment6 {

    private static Map<Character, Set<Integer>> characterConcordance(final String input) {
        //create a Hashmap that takes in a char as the key and a set (for the indexes) as the value
        Map<Character, Set<Integer>> concordance = new HashMap<Character, Set<Integer>>();

        //iterate over the string of characters
        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i); //get the char at index i
            //if the char is a space, ignore it
            if (charAt == ' ') {
                continue; // ignore spaces
            }
            //else get the set which is the value of our current key "charAt" using concordance.get(charAt)
            Set<Integer> set = concordance.get(charAt);
            //if the set is null create a new HashSet
            if (set == null) {
                set = new HashSet<Integer>();
            }
            //add the index of charAt to the set
            set.add(i); // use i for 0-indexed, or (i+1) for 1-indexed positions
            //then put the set on the hashmap
            concordance.put(charAt, set);
        }
        return concordance;
    }

    public static void main(final String[] args) {

        System.out.println(characterConcordance("Hello World"));
    }
}
