package com.epam.maintask1.task3;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 2 радиуса");
      int radius1=radiusInput();
      int radius2=radiusInput();
      printResult(findAreaOfRing(radius1,radius2));

    }
    public static int radiusInput() {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        return radius;
    }
    public static double findAreaOfRing(int radius1, int radius2) {
       double areaRing=abs(PI*(pow(radius1,2)-pow(radius2,2)));
        return areaRing;
    }
    public static void printResult(double area ){
        System.out.println("Площадь кольца равна " + area);
    }
}
