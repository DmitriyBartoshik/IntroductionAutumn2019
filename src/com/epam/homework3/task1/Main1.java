package com.epam.homework3.task1;

import java.util.Arrays;
import java.util.Random;

public class Main1 {

    public static void main(String[] args) {
        double[][] array = readArray(5, 5);
        printArray(array);
        System.out.println(String.format("%8.2f",findMaxMean(array)));
        System.out.println(String.format("%8.2f",findMinMean(array)));

    }

// заполнение матрицы
    public static double[][] readArray(int n, int m) {

        Random random = new Random();
        double[][] array = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextDouble() * 100;
            }
        }
        return array;
    }
// нахождение максимального элемента
    public static double findMaxMean(double[][] array) {
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

        }
        return max;
    }
    // нахождение минимального элемента
    public static double findMinMean(double[][] array) {
        double min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }

        }
        return min;
    }
// вывод массива
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%8.2f",array[i][j]) + "  ");
            }
            System.out.println();
        }
    }

}