package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Samnple input
        // String[][] calendarP1 = {{"09:00", "10:30"}, {"12:00", "13:00"}, {"16:00", "18:00"}};
        // String[][] calendarP2 = {{"10:00", "11:30"}, {"12:30", "14:00"}, {"16:00", "17:00"}};
        String[][] calendarP1 = {{"12:00", "13:00"}};
        String[][] calendarP2 = {{"15:00", "16:30"}};

        // limit meeting 10:00 ---- 11:30
        // output

        String[] calendarBoundsP1 = {"08:00", "18:00"};
        String[] calendarBoundsP2 = {"09:00", "17:00"};

        String meetingDuration = "30";

        String[] limitBounds = windowsAvailable(calendarBoundsP1, calendarBoundsP2);

        findGaps(calendarP1, calendarP2, limitBounds);

        // Samples output:
        String[][] output = {{"11:30", "12:00"}, {"15:00", "18:00"}, {"18:00", "18:30"}};

    }

    public static void Solution(String[][] calendarP1, String[][] calendarP2) {

        List<String> Calendar = mergeCalendar(calendarP1, calendarP2);
    }

    public static String[] windowsAvailable(String[] timeP1LimitBounds, String[] timeP2LimitBounds) {
        String[] timeWindowsAvailable = new String[2];
        timeWindowsAvailable[0] = returnMajorTime(timeP1LimitBounds[0], timeP2LimitBounds[0]);
        timeWindowsAvailable[1] = returnMinorTime(timeP1LimitBounds[1], timeP2LimitBounds[1]);
        return timeWindowsAvailable;
    }

    private static String returnMajorTime(String time1, String time2) {

        String[] arrayHourAndMinutes1 = time1.split(":");
        String[] arrayHourAndMinutes2 = time2.split(":");

        int hour1 = Integer.parseInt(arrayHourAndMinutes1[0]);
        int minute1 = Integer.parseInt(arrayHourAndMinutes1[1]);

        int hour2 = Integer.parseInt(arrayHourAndMinutes2[0]);
        int minute2 = Integer.parseInt(arrayHourAndMinutes2[1]);

        if (hour1 == hour2) {
            if (minute1 == minute2)
                return time1;
            if (minute1 > minute2)
                return time1;
            else
                return time2;
        } else {
            if (hour1 > hour2) {
                return time1;
            } else {
                return time2;
            }
        }
    }

    public static String returnMinorTime(String time1, String time2) {

        String[] arrayHourAndMinutes1 = time1.split(":");
        String[] arrayHourAndMinutes2 = time2.split(":");

        int hour1 = Integer.parseInt(arrayHourAndMinutes1[0]);
        int minute1 = Integer.parseInt(arrayHourAndMinutes1[1]);

        int hour2 = Integer.parseInt(arrayHourAndMinutes2[0]);
        int minute2 = Integer.parseInt(arrayHourAndMinutes2[1]);

        if (hour1 == hour2) {
            if (minute1 == minute2)
                return time1;
            if (minute1 > minute2)
                return time2;
            else
                return time1;
        } else {
            if (hour1 > hour2) {
                return time2;
            } else {
                return time1;
            }
        }
    }


    // add p1 and p2 calendar
    public static List<String> mergeCalendar(String[][] calendarP1, String[][] calendarP2) {

        return new ArrayList<>();
    }

    // find gaps inside calendar
    public static void findGaps(String[][] calendar1, String[][] calendar2, String[] limitBounds) {
        List<String> limit = new ArrayList<>();

        String earlyBound = LimitBounds[0];
        String lateBound = LimitBounds[1];

        String earlyMetting = returnMinorTime(calendar1[0][0], calendar2[0][0]);
        String [] gap = {limitBounds[0], earlyMetting};
        String lateMetting = returnMinorTime(calendar1[0][0], calendar2[0][0]);
        String [] gap = {limitBounds[0], earlyMetting};




        // 9:00-12:00	16:30-17:00
    }
}