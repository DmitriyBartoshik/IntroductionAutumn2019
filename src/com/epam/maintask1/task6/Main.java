package com.epam.maintask1.task6;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        int number = readNumber();
        printResult(reverseNumber(number));
    }


    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (check(number))
            return number;
        System.out.println("число, которое вы ввели, не является семизначным.Введите число ещё раз");
        return readNumber();
    }

    public static boolean check(int number) {
        if ((number - 1000000) >= 0 && (number + 9000000) < 19000000)
            return true;
        else
            return false;
    }

    public static int reverseNumber(int number) {
        int endNumber = 0;
        int power = 0;
        int n = 0;
        for (int i = 0; i < 7; i++) {
            power = 7 - (i + 1);
            n = (int) pow(10, power);
            int newNumber = (number / n);
            endNumber += newNumber * pow(10, i);
            number -= newNumber * n;
        }
        return endNumber;
    }

    public static void printResult(int number) {
        System.out.println("полученное число: " + number);

    }

}

