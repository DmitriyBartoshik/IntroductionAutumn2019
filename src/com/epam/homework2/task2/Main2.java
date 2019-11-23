package com.epam.homework2.task2;

public class Main2 {
    public static void main(String[] args) {

        System.out.println(findNOK(4, 4));
    }

    // найти наибольшую цифру натурального числа
    public static int fingBiggestNumber(int number) {
        int maxNumber = 0;
        int n;
        while (number > 9) {
            n = number % 10;
            if (n > maxNumber) {
                maxNumber = n;
            }
            number = n;
        }
        return maxNumber;
    }

    // проверить, является ли заданное натуральное число полиндромом
    public static boolean checkOnPalindrome(int number) {
        int n1 = number;
        int n2 = 0;
        while (number != 0) {
            n2 *= 10;
            n2 += number % 10;
            number /= 10;
        }
        return n1 == n2;
    }

    // определить, является ли заданое натуральное число простым
    public static boolean checkOnSimpleNumber(int number) {
        int count = 0;
        if (checkNumber(number)) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                return true;
            } else {
                return false;
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

    //найти все простые делители заданного натурального числа
    public static void findAllSimpleDivider(int number) {
        int n;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (checkOnSimpleNumber(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    //найти НОД и НОК двух натуральных чисел a и b
    public static int findNOD(int a, int b) {
        return (b == 0) ? a : findNOD(b, a % b);
    }

    public static int findNOK(int a, int b) {
        return a / findNOD(a, b) * b;
    }

    //найдите количество различных цифр у заданного числа
    private static int finfDifferentNumerals(int i) {
        int j=0, dif,  x;
        do {
            j++;
            x = i % 10;
            i/=10;
            dif = 0;
            while (i > 0) {
                if (x != i % 10) {
                    dif = dif * 10 + i % 10;
                }
                i /= 10;
            }
            i=dif;
        } while (dif>0);
        return j;
    }

}
