package com.epam.homework3.task2;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        double[][] array = readArray(2, 2);
        printArray(array);
        System.out.println(String.format("%8.2f", findArithmeticalMean(array)));
        System.out.println(String.format("%8.2f", findGeometricMean(array)));


    }

    // заполнение матрицы
    public static double[][] readArray(int n, int m) {

        Random random = new Random();
        double[][] array = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextDouble() * 10;
            }
        }
        return array;
    }
// нахождение среднего арифметического
    public static double findArithmeticalMean(double[][] array) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        return sum / count;
    }
    // нахождение среднего геометрического
    public static double findGeometricMean(double[][] array) {
        double composition = 1;

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                composition *= array[i][j];
                count++;
            }
        }
        return composition / count;
    }

    // вывод массива
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%8.2f", array[i][j]) + "  ");
            }
            System.out.println();
        }
    }
}
