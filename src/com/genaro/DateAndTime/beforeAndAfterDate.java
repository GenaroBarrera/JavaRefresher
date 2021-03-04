package com.genaro.DateAndTime;

import java.time.LocalDate;

public class beforeAndAfterDate {
    public static void main(String[] args) {
        //check if a date falls before a certain date
        boolean isBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));
        System.out.println(isBefore); //should be false

        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));
        System.out.println(isAfter); //should be true
    }
}
