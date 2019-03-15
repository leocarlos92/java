package com.hackerrank.exercise10;

import java.util.Calendar;
import java.util.HashMap;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */


    static String findDay(int month, int day, int year) {

        HashMap<Integer, String> daysOfTheWeek = new HashMap<Integer, String>();
        daysOfTheWeek.put(1, "SUNDAY");
        daysOfTheWeek.put(2, "MONDAY");
        daysOfTheWeek.put(3, "TUESDAY");
        daysOfTheWeek.put(4, "WEDNESDAY");
        daysOfTheWeek.put(5, "THURSDAY");
        daysOfTheWeek.put(6, "FRIDAY");
        daysOfTheWeek.put(7, "SATURDAY");

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);

        int daySet = calendar.get(Calendar.DAY_OF_WEEK);

        return daysOfTheWeek.get(daySet);
    }
}

