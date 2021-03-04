package com.genaro.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * Date boundaries can be obtained from a given date.
 * In the following two examples we get the LocalDateTime that represents the beginning of the day (2016-06-12T00:00) of the given date
 * and the LocalDate that represents the beginning of the month (2016-06-01) respectively:
 */
public class DateBoundaries {
    public static void main(String[] args) {
        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
                .with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(beginningOfDay);
        System.out.println(firstDayOfMonth);

    }
}
