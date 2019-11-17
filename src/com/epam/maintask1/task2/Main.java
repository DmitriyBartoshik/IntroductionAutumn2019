package com.epam.maintask1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("задайте массу динозавра в килограммах");
        int kg = weightInput();
        printResult(kg, tranferToGrams(kg), tranferToMilligrams(kg), tranferToTon(kg));
    }

    public static int weightInput() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    public static long tranferToMilligrams(int kg) {
        long milligrams = kg * 1_000_000;
        return milligrams;
    }

    public static long tranferToGrams(int kg) {
        long grams = kg * 1000;
        return grams;
    }

    public static double tranferToTon(int kg) {
        double ton = kg / 1000.0;
        return ton;
    }

    public static void printResult(int kg, long grams, long milligrams, double ton) {
        System.out.println("масса динозавра в килограммах = " + kg);
        System.out.println("масса динозавра в граммах = " + grams);
        System.out.println("масса динозавра в миллиграммах = " + milligrams);
        System.out.println("масса динозавра в тоннах = " + ton);
    }

}
