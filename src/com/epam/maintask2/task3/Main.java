package com.epam.maintask2.task3;

import java.io.IOException;

public class Main {
    static char[] wowelsChar = new char[]{'e', 'y', 'u', 'i', 'o', 'a'};
    static int[] wowelsInt = new int[]{101, 121, 117, 105, 111, 97};

    public static boolean way1(int ch) {
        String s = new Character((char) ch).toString();
        return s.matches("[eyuioa]");
    }

    public static boolean way2(int ch) {
        switch (ch) {
            case 'e':
                return true;
            case 'y':
                return true;
            case 'u':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'a':
                return true;
        }
        return false;
    }

    public static boolean way3(int ch) {
        switch (ch) {
            case 101:
                return true;
            case 121:
                return true;
            case 117:
                return true;
            case 105:
                return true;
            case 111:
                return true;
            case 97:
                return true;
        }
        return false;
    }

    public static void way4(int ch) {
        for (char c : wowelsChar)
            if (ch == c) System.out.println("It's vowel ");
    }

    public static void way5(int ch) {
        for (int i : wowelsInt)
            if (ch == i) System.out.println("It's vowel");
    }

    public static void way6(int ch) {
        for (int i = 0; i < wowelsChar.length; i++)
            if (ch == wowelsChar[i]) System.out.println("It's vowel");
    }

    public static void way7(int ch) {
        for (int i = 0; i < wowelsInt.length; i++)
            if (ch == wowelsInt[i]) System.out.println("It's vowel");
    }

    public static void main(String[] args) throws IOException {
        int ch = System.in.read();
        ch = Character.toLowerCase(ch);
        System.out.println(way1(ch));
        System.out.println(way2(ch));
        System.out.println(way3(ch));
        way4(ch);
        way5(ch);
        way6(ch);
        way7(ch);
    }
}
