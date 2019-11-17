package com.epam.maintask1.task4;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        int number = readNumber();
      int[]numberDigit= numberDivision(number);
        checkResult(numberDigit);


    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (check(number))
            return number;
        System.out.println("число, которое вы ввели, не является четырёхзначным.Введите число ещё раз");
        return readNumber();
    }

    public static boolean check(int number) {
        if ((number - 1000) >= 0 && (number + 9000) < 19000)
            return true;
        else
            return false;
    }

    public static int[] numberDivision(int number) {
        int power = 0;
        int n = 0;
        int[] numberDigit = new int[4];
        for (int i = 0; i < 4; i++) {
            power = 4 - (i + 1);
            n = (int) pow(10, power);
            numberDigit[i] = (number / n);
            number = number - numberDigit[i] * n;
        }
        return numberDigit;
    }

    public static void checkResult(int[] numberDigit) {
        int increase = 0;
        int decrease = 0;
        for (int i = 0; i < 3; i++) {
            if (numberDigit[i] < numberDigit[i + 1])
                increase++;
            if (numberDigit[i] > numberDigit[i + 1])
                decrease++;
        }
        printResult(increase,decrease);
    }

    public static void printResult(int increase, int decrease) {
        if (increase == 3) {
            System.out.println("цифры числа имеют возрастающую последовательность");
        }
        if (decrease == 3) {
            System.out.println("цифры числа имеют убывающую последовательность ");
        }
        if (decrease != 3 && increase != 3)
            System.out.println("цифры числа не имеют возрастающую или убывающую последовательность");

    }

}


