package com.epam.maintask1.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число a");
        int a = readNumber();
        System.out.println("Введите число b");
        int b = readNumber();
        changeValue(a,b);
    }
    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();

        return number;
    }
    public static void changeValue(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        printResult(a,b);
    }
    public static void printResult(int a, int b){
        System.out.println("a= " + a);
        System.out.println("b = " + b);
    }
}
