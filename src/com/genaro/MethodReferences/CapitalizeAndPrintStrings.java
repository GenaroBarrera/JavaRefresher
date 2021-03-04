package com.genaro.MethodReferences;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalizeAndPrintStrings {
    public static void main(String[] args) {
        //We'll begin with a very simple example, capitalizing and printing a list of Strings:
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");

        //We can achieve this by leveraging a simple lambda expression calling the StringUtils.capitalize() method directly:
        messages.forEach(word -> StringUtils.capitalize(word));
        /**
         * How can I print this or save this on another list?
         */

        //Or, we can use a method reference to simply refer to the capitalize static method:
        messages.forEach(StringUtils::capitalize);

        //Notice that method references always utilize the :: operator.
    }
}
