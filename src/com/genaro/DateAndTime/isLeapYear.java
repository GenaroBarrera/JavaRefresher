package com.genaro.DateAndTime;

import java.time.LocalDate;

public class isLeapYear {
    public static void main(String[] args) {
        //check if we're currently on a leap year (should be no on 2021)
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println(leapYear);

        boolean leapYearDate = LocalDate.parse("2020-01-15").isLeapYear();
        System.out.println(leapYearDate); //this one should be true 2020 was a leap year
    }
}
