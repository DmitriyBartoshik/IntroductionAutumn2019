package com.epam.homework2.task1;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {

        countHeards(1000);
    }
    /* необходимо написать программу "Heads or Tails" ("Орёл или решка?"),
     которая бы "подбрасывала" условно монету, к примеру,1000 раз и сообщала,
     сколько раз выпал орёл, а сколько - решка.
      */
    public static void countHeards(int n){
        Random random= new Random();
        int count=0;
        int side;
        for (int i=0; i<n; i++){
            side=random.nextInt(2); //запись случайного числа в side от 0 до 1
            if (side==1) {
                count++;
            }
        }
        System.out.println("Орёл выпал "+ count +" раз");
        System.out.println("Решка выпала "+ (n-count) +" раз");
    }
}
