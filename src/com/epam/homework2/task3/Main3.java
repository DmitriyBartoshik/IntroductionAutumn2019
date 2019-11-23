package com.epam.homework2.task3;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(checkOnPerfectNumber(28));
    }

    // проверить, является ли число совершенным
    public static boolean checkOnPerfectNumber(int number) {
        int sum = 0;
        if (checkNumber(number)) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNumber(int number) {
        if (number < 2) {
            return false;
        } else {
            return true;
        }
    }
}
