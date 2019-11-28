package com.epam.homework3.task4;

import java.util.Random;

public class Main4 {
    public static double[][] array;

    public static void main(String[] args) {
        array = readArray(4, 4);
    }


    private static double[][] transpose(double[][] array, int n, int m) {
        if (n == m) {
            transposeSquareMatrix(array, n);
        }

        return array;
    }

    private static double[][] transposeSquareMatrix(double[][] array, int n) {
        double temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        return array;
    }


    private static double[][] readArray(int n, int m) {
        Random random = new Random();
        double[][] array = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextDouble() * 100;
            }
        }
        return array;
    }


    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(String.format("%8.2f", array[i][j]) + "  ");
            }
            System.out.println();
        }
    }


}
