package com.epam.homework1.maintask2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите возраст дракона");
        int age = readAge();
        int head = computationHead(age);
        int eyes = computationEyes(head);
        printResult(head, eyes);

    }

    public static int readAge() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (check(age))
            return age;
        else
            System.out.println("вы не правильно ввели возраст дракона, введите положительное целое число");
            return readAge();
    }

    public static boolean check(int age) {
        if (age > 0)
            return true;
        else
            return false;
    }

    public static int computationHead(int age) {
        int head = 3;

        if (age > 300) {
            head += (3 * 200) + (2 * 100) + (age - 300);
        }
        if (age > 200 && age < 301) {
            head += (3 * 200) + (2 * (age - 200));
        }
        if (age > 0 && age < 201) {
            head += head * 3;
        }
        return head;
    }

    public static int computationEyes(int head) {
        int eyes = head * 2;
        return eyes;
    }

    public static void printResult(int head, int eyes) {
        System.out.println("число голов у дракона = " + head);
        System.out.println("число глаз у дракона = " + eyes);
    }
}
