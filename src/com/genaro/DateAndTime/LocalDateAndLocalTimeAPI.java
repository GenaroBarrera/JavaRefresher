package com.genaro.DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateAndLocalTimeAPI {
    public static void main(String[] args) {
        //LocalDate
        LocalDate localDate = LocalDate.now(); //LocalDate represents a date in ISO format (yyyy-MM-dd) without time.
        System.out.println(localDate);

        //print specific dates using LocalDate.of or .parse
        System.out.println(LocalDate.of(2015, 02, 20)); //used to create an instance of LocalDate
        System.out.println(LocalDate.parse("2015-02-20")); //used to create an instance of LocalTime from a string

        //add days to the current date using plusDays(); (get tomorrow's date)
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        //This example obtains the current date and subtracts one month. using minus();
        // Note how it accepts an enum as the time unit:
        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(previousMonthSameDay);


        //LocalTime
        //An instance of current LocalTime can be created from the system clock as below:
        LocalTime now = LocalTime.now();
        System.out.println(now);

        //In the below code sample,
        // we create a LocalTime representing 06:30 AM by parsing a string representation:
        LocalTime sixThirtyP = LocalTime.parse("06:30");
        System.out.println(sixThirtyP);

        //The Factory method “of” can be used to create a LocalTime.
        // For example the below code creates LocalTime representing 06:30 AM using the factory method:
        LocalTime sixThirtyOf = LocalTime.of(6, 30);
        System.out.println(sixThirtyOf);

        //The below example creates a LocalTime by parsing a string
        // and adds an hour to it by using the “plus” API. The result would be LocalTime representing 07:30 AM:
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println(sevenThirty);

        //Various getter methods are available which can be used
        // to get specific units of time like hour, min and secs like below:
        int six = LocalTime.parse("06:30").getHour();
        System.out.println(six);

        //We can also check if a specific time is before or after another specific time.
        // The below code sample compares two LocalTime for which the result would be true:
        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        System.out.println(isbefore);

        //The max, min and noon time of a day can be obtained by constants in LocalTime class.
        // This is very useful when performing database queries to find records within a given span of time. For example, the below code represents 23:59:59.99:
        LocalTime maxTime = LocalTime.MAX;
        System.out.println(maxTime);

        //There's also LocalDateTime which combines both of them
    }
}
