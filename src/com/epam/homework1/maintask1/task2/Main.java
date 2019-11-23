package com.epam.homework1.maintask1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("задайте массу динозавра в килограммах");
        int kg = weightInput();
        printResult(kg, tranferToGrams(kg), tranferToMilligrams(kg), tranferToTon(kg));
    }

    private static int weightInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static long tranferToMilligrams(int kg) {
        return kg * 1_000_000;
    }

    private static long tranferToGrams(int kg) {
        return  kg * 1000;
    }

    private static double tranferToTon(int kg) {
        return kg / 1000.0;
    }

    private static void printResult(int kg, long grams, long milligrams, double ton) {
        System.out.println("масса динозавра в килограммах = " + kg);
        System.out.println("масса динозавра в граммах = " + grams);
        System.out.println("масса динозавра в миллиграммах = " + milligrams);
        System.out.println("масса динозавра в тоннах = " + ton);
    }
}
