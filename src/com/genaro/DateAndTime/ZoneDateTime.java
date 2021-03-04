package com.genaro.DateAndTime;

import java.time.*;
import java.util.Set;

public class ZoneDateTime {
    public static void main(String[] args) {
        //In this code snippet we create a Zone for Paris:
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        //A set of all zone ids can be obtained as below:
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneIds);

        //The LocalDateTime can be converted to a specific zone:
        LocalDateTime ldt = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt, zoneId);
        System.out.println(zonedDateTime);

        //The ZonedDateTime provides parse method to get time zone specific date time:
        System.out.println(ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]"));

        /**
         * Another way to work with time zone is by using OffsetDateTime.
         * The OffsetDateTime is an immutable representation of a date-time with an offset.
         * This class stores all date and time fields, to a precision of nanoseconds, as well as the offset from UTC/Greenwich.
         *
         * The OffSetDateTime instance can be created as below using ZoneOffset.
         * Here we create a LocalDateTime representing 6:30 am on 20th February 2015:
         */
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        ZoneOffset offset = ZoneOffset.of("+02:00");
        /**
         * Then we add two hours to the time by creating a ZoneOffset
         * and setting for the localDateTime instance:
         */
        OffsetDateTime offSetByTwo = OffsetDateTime
                .of(localDateTime, offset);
        System.out.println(offSetByTwo);
        /**
         * We now have a localDateTime of 2015-02-20 06:30 +02:00.
         * Now to modify date and time values using the Period and Duration classes.
         */
    }
}
