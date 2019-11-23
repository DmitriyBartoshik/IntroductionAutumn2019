package com.epam.homework1.maintask1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа a b и c ");
        int a = readNumber();
        int b = readNumber();
        int c = readNumber();

        boolean bool=comparisonOfNumners(a,b,c);
        printResult(bool);


    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();

        return number;
    }

    public static boolean comparisonOfNumners(int a, int b, int c) {
        if (a == b && a == c)
            return true;
        else
            return false;
    }

    public static void printResult(boolean bool){
        if(bool)
            System.out.println("Числа a b и c равны между собой");
        else
            System.out.println("Числа a b и c не равны между собой");
    }
}



