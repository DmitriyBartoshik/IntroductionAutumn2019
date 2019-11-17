package com.epam.maintask2.task1;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите координату х точки А ");
        int Ax=readNumber();
        System.out.println("Введите координату y точки А ");
        int Ay=readNumber();
        System.out.println("Введите координату х точки B ");
        int Bx=readNumber();
        System.out.println("Введите координату y точки B ");
        int By=readNumber();
        System.out.println("Введите координату х точки C ");
        int Cx=readNumber();
        System.out.println("Введите координату y точки C ");
        int Cy=readNumber();

        double AB=findLengthSide(Ax,Ay,Bx,By);
        double BC=findLengthSide(Bx,By,Cx,Cy);
        double AC= findLengthSide(Ax,Ay,Cx,Cy);

        System.out.println("AB= " + AB);
        System.out.println("BC= " + BC);
        System.out.println("AC= " + AC);

        checkForRightTriangle(AB,AC,BC);

    }
    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        return number;
    }
    public static double findLengthSide(int x1, int y1, int x2, int y2){
        double side=sqrt((pow((x1-x2),2.0)) +(pow((y1-y2),2.0)));
        return side;
    }

    public static void checkForRightTriangle (double side1, double side2, double side3){
       if (triangleCheck(side1,side2,side3)){
           System.out.print("такой треугольник существует");
           if (side1 == sqrt((pow(side2, 2)) + (pow(side3, 2))) || side2 == sqrt((pow(side3, 2)) + (pow(side1, 2)))|| side3 == sqrt((pow(side1, 2)) + (pow(side2, 2))))
               System.out.println(", также прямоугольный");
       }
         else
           System.out.println("Такой треугольник не существует");
    }


    public static boolean triangleCheck(double side1, double side2, double side3)
    {
        if (side1+side2<=side3 || side1+side3<=side2 || side2+side3<=side1)
            return false;
        else
            return true;
    }
}
