package com.epam.maintask2.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static Integer day = 28;
    private static Integer month = 2;
    private static Integer year = 400;
    static List<Integer> fullMonth = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
    static List<Integer> noFullMonth = new ArrayList<>(Arrays.asList(2, 4, 6, 9, 11));

    public static void main(String[] args) {
        addOneDay();
        write();
        addOneDay();
        write();
    }

    public static void addOneDay() {
        boolean leap = isLeap(year);
        if (day == 31 && month != 12)
            month += 1;
        else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year += 1;
        } else if (day < 30 && month != 2 || day == 30 && fullMonth.contains(month) || day == 28 && month == 2 && leap)
            day += 1;
        else if (day == 30 && noFullMonth.contains(month) || day == 29 && month == 2 && leap) {
            day = 1;
            month += 1;
        }
    }

    public static boolean isLeap(Integer year) {
        if (year % 100 == 0 && year % 400 != 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }

    public static void write() {
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }
}
