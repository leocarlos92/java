package org.example;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        prints();
    }

    public static void time() {
        Duration duration = Duration.ofSeconds(10);         // not zone
        System.out.println(duration);

        LocalTime time = LocalTime.now();                  // zone
        System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.now();  // zone
        System.out.println(localDateTime);

        System.out.println(duration.getSeconds());          // get seconds is durations

        Period period = Period.ofDays(2000);
        System.out.println(period);          // get seconds is durations

        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(1, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);
        var offset = z.getOffset();
        duration = Duration.ofHours(3);
        var later = z.plus(duration);
        System.out.println(later.getHour() + " " + offset.equals(later.getOffset()));

        int year = 1874;
        Month month = Month.MARCH;
        int day = 24;
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println(date.isBefore(LocalDate.now()));

        localDate = LocalDate.of(2022, 3, 13);
        localTime = LocalTime.of(2, 0);
        zone = ZoneId.of("America/New_York");
        z = ZonedDateTime.of(localDate, localTime, zone);

        var waffleDay = LocalDate.of(2022, Month.MARCH, 25);
        period = Period.of(1, 6, 3);
        var later1 = waffleDay.plus(period);
        later1.plusDays(1);
        var thisOne = LocalDate.of(2023, Month.SEPTEMBER, 28);
        var thatOne = LocalDate.of(2023, Month.SEPTEMBER, 29);
        System.out.println(later1.isBefore(thisOne) + " " + later1.isBefore(thatOne));

        var montyPythonDay = LocalDate.of(2023, Month.MAY, 10);
        var aprilFools = LocalDate.of(2023, Month.APRIL, 1);
        var duration1 = Duration.ofDays(1);
        // var result = montyPythonDay.minus(duration1);
        // System.out.println(result + " " + aprilFools.isBefore(result));

        var localDate1 = LocalDate.of(2022, Month.NOVEMBER, 6);
        var localTime1 = LocalTime.of(1, 0);
        var zone1 = ZoneId.of("America/New_York");
        var z1 = ZonedDateTime.of(localDate1, localTime1, zone1);
        var offset1 = z1.getOffset();
        for (int i = 0; i < 6; i++) z1.plusHours(1);
        System.out.print(z1.getHour() + " " + offset1.equals(z1.getOffset()));

        localTime = LocalTime.of(1, 0, 0, 9);

        date.getYear();
        period.getYears();
        z1.getYear();

        var time1 = LocalTime.of(1, 2, 3, 4);
        System.out.println(time1);

        ChronoUnit chronoUnit = ChronoUnit.HOURS;
        Duration duration2 = Duration.ofHours(1);
        Instant instant = Instant.now();
        Period period1 = Period.ofMonths(1);

        var localDate2 = LocalDate.of(2022, 3, 13);
        var localTime2 = LocalTime.of(13, 0);
        var zone2 = ZoneId.of("America/New_York");
        var z2 = ZonedDateTime.of(localDate2, localTime2, zone2);
        var offset2 = z2.getOffset();
        var duration3 = Duration.ofHours(3);
        var later2 = z2.plus(duration3);
        System.out.println(later2.getHour() + " " + offset2.equals(later2.getOffset()));

        var montyPythonDay1 = LocalDate.of(2022, Month.MAY, 10);
        var time2 = LocalTime.of(5, 40);
        var dateTime = LocalDateTime.of(montyPythonDay1, time2);
        var duration4 = Duration.ofDays(1);
        var result = dateTime.minus(duration4);
        System.out.println(result);


        var date1 = LocalDate.of(2022, Month.MARCH, 3);
        var date2 = LocalDate.of(2022, Month.FEBRUARY, 31);
        System.out.println(date1.equals(date2));


    }

    public static void prints() {
        System.out.print("""
                "ape "baboon" "gorilla"
                """);

        var line = new String("-");
        var anotherLine = line.concat("-");
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());

        var text = """ 
                ant antelope \\s \\
                n cat "kitten" \\ seal sea lion 
                """;
        System.out.print(text);

        var teams = new StringBuilder("333");
        teams.append(" 806");
        teams.append(" 1601");
        System.out.print(teams);

        var happy = " :) - (: ";
        var really = happy.trim();
        var question = happy.substring(1, happy.length() - 1);
        System.out.println(really.equals(question));

        var numPigeons = Long.valueOf("100");
        // var numPigeons1 = Long.parseLong("100");
        System.out.println(numPigeons.toString());

        System.out.print(""" 
                "ape" "baboon" "gorilla" 
                """);
    }

    public static void variables() {
        // int _;           // not ok for declare
        int _Blue;
        // int 2BLue;       // not ok for declare
        int bLue$;
        int BLue;

        var baa = 8;
        var bleat = ~baa;
        var sheep = ~bleat;
        System.out.printf(bleat + " " + sheep);

        // double num1, int num2 =0;

    }

    public static void values() {
        int meal = 5;
        int tip = 2;
        var total = meal + (meal > 6 ? tip++ : tip--);

        var b = "12";
        b += "3";
        // b.reverse();
        System.out.println(b.toString());

        var line = new StringBuilder("-");
        var anotherLine = line.append("-");
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());
    }

    public static void math() {
        var cat = Math.ceil(65);
        var moose = Math.max(7, 8);
        var penguin = Math.pow(2, 3);
    }

    public static void booleanTypes() {
        if (true && false || false ^ true) {

        }
    }

    public static void pi() {
        /*byte b = 3.14;
        double d = 3.14;
        float f = 3.14;
        short s = 3.14;*/
    }

    public static void secret(StringBuilder mystery) {
        char ch = mystery.charAt(3);
        mystery = mystery.insert(1, "more");
        int num = mystery.length();
    }

    public static class Airplane {
        static int start = 2;
        final int end;

        public Airplane(int x) {
            x = 4;
            end = x;
        }

        public void fly(int distance) {
            System.out.print(end - start + " ");
            System.out.print(distance);
        }

        public void main1(String start) {
            new Airplane(10).fly(5);
        }
    }
}