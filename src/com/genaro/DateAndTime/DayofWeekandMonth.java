package com.genaro.DateAndTime;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayofWeekandMonth {
    public static void main(String[] args) {
        /**
         * In the following two code examples we parse the date “2016-06-12” and get the day of the week and the day of the month respectively.
         * Note the return values, the first is an object representing the DayOfWeek while the second in an int representing the ordinal value of the month:
         */

        //06-12-2016 took place on June the 12th on a Sunday
        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek(); //getDayOfTheWeek() should return sunday
        System.out.println(sunday);

        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();  //getDayOfTheMonth() should return 12
        System.out.println(twelve);

        int dayOfYear = LocalDate.parse("2016-06-12").getDayOfYear(); //this should return the day of the year ect..
        System.out.println(dayOfYear);
    }
}
