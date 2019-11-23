package com.epam.homework2.task4;

public class Main4 {
    public static void main(String[] args) {
        findAllFriendNumberInRange(300);
    }
  /*  Дру́жественные чи́сла — два различных натуральных числа , для которых
    сумма всех собственных делителей первого числа равна второму числу и
    наоборот, сумма всех собственных делителей второго числа равна первому
    числу. Дружественные числа были открыты последователями Пифагора ,
    которые, однако, знали только одну пару дружественных чисел – 220 и 284.
    Найдите все дружественные числа в заданном диапазоне.*/

    public static void findAllFriendNumberInRange(int range) {
        for (int i = 1; i < range; i++) {
            for (int j = 1; j < range; j++) {
                if (checkOnFriendlyNumber(i, j)) {
                    System.out.println(i + "   " + j);
                }
            }
        }
    }


    public static boolean checkOnFriendlyNumber(int number1, int number2) {
        if (checkNumber(number1, number2)) {
            if ((findSumDividerOfNumber(number1) == number2) && (findSumDividerOfNumber(number2) == number1)) {
                return true;
            }
        }
        return false;
    }


    public static int findSumDividerOfNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {

                sum += i;
            }
        }
        return sum;
    }

    public static boolean checkNumber(int number1, int number2) {
        if (number1 < 1 || number2 < 1 || number1 == number2) {
            return false;
        } else {
            return true;
        }
    }
}
