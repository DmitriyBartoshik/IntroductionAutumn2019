package com.epam.homework2.task2;

public class Main2 {
    public static void main(String[] args) {

        int g = fingBiggestNumber(4567);
        System.out.println(g);
    }

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
}
