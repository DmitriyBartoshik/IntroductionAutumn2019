package com.epam.homework1.maintask1.task5;


import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        int number = readNumber();
        int[] numberDigit = numberDivision(number);
        printResult(arithmeticalMean(numberDigit), geometricMean(numberDigit));
    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (check(number))
            return number;
        System.out.println("число, которое вы ввели, не является шестизначным.Введите число ещё раз");
        return readNumber();
    }

    public static boolean check(int number) {
        if ((number - 100000) >= 0 && (number + 900000) < 1900000)
            return true;
        else
            return false;
    }

    public static int[] numberDivision(int number) {
        int power = 0;
        int n = 0;
        int[] numberDigit = new int[6];
        for (int i = 0; i < 6; i++) {
            power = 6 - (i + 1);
            n = (int) pow(10, power);
            numberDigit[i] = (number / n);
            number = number - numberDigit[i] * n;
        }
        return numberDigit;
    }

    public static double arithmeticalMean(int[] numberDigit) {
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += numberDigit[i];
        }
        return sum / 6.0;
    }

    public static double geometricMean(int[] numberDigit) {
        double composition = 1;
        for (int i = 0; i < 6; i++) {
            composition *= numberDigit[i];
        }
        return composition / 6.0;
    }

    public static void printResult(double arithmeticalMean, double geometricMean) {
        System.out.println("среднее арифметическое - " + arithmeticalMean);
        System.out.println("среднее геометрическое - " + geometricMean);
    }
}



