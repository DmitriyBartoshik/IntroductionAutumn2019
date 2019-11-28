package com.epam.homework3.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main3 {
    private static double[][] array;

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        boolean bool = true;
        int line = 3;
        int column = 4;
        array = readArray(line, column);
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (bool) {
                    list = findSideBySide(i, j, array.length, array[i].length);
                    if (checkLocalMin(list, i, j)) {
                        System.out.println(String.format("%8.2f", array[i][j]));
                        bool = false;
                    }
                }
            }
        }
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

    public static List<Double> findSideBySide(int currentLine, int currentColumn, int maxLine, int maxColumn) {
        List<Double> list = new ArrayList<Double>();
        if (currentLine == 0) {
            if (currentColumn == 0) {
                list.add(array[currentLine + 1][currentColumn]);
                list.add(array[currentLine][currentColumn + 1]);
            } else if (currentColumn == maxColumn - 1) {
                list.add(array[currentLine][currentColumn - 1]);
                list.add(array[currentLine + 1][currentColumn]);
            } else {
                list.add(array[currentLine + 1][currentColumn]);
                list.add(array[currentLine][currentColumn + 1]);
                list.add(array[currentLine][currentColumn - 1]);
            }
        } else if (currentColumn == 0) {
            if (currentLine == maxLine - 1) {
                list.add(array[currentLine][currentColumn + 1]);
                list.add(array[currentLine - 1][currentColumn]);
            } else {
                list.add(array[currentLine - 1][currentColumn]);
                list.add(array[currentLine][currentColumn + 1]);
                list.add(array[currentLine + 1][currentColumn]);

            }
        } else if (currentColumn == maxColumn - 1) {
            if (currentLine == maxLine - 1) {
                list.add(array[currentLine - 1][currentColumn]);
                list.add(array[currentLine][currentColumn - 1]);
            } else {
                list.add(array[currentLine - 1][currentColumn]);
                list.add(array[currentLine][currentColumn - 1]);
                list.add(array[currentLine + 1][currentColumn]);
            }

        } else if (currentLine == maxLine - 1) {
            list.add(array[currentLine - 1][currentColumn]);
            list.add(array[currentLine][currentColumn + 1]);
            list.add(array[currentLine][currentColumn - 1]);

        } else {
            list.add(array[currentLine - 1][currentColumn]);
            list.add(array[currentLine][currentColumn + 1]);
            list.add(array[currentLine][currentColumn - 1]);
            list.add(array[currentLine + 1][currentColumn]);
        }

        return list;
    }

    public static boolean checkLocalMin(List<Double> doubleList, int currentLine, int currentColumn) {
        boolean bool = true;
        for (Double d : doubleList) {
            if (d < array[currentLine][currentColumn]) {
                bool = false;
            }
        }
        return bool;
    }

    public static boolean checkOnFindNumber(boolean bool) {
        return bool;
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
