package com.pb.dutov.hw3;
import java.util.Random;
import java.util.Scanner;
public class Bingo {
    public static void main(String [] args) {
        int counter = 0;
        Random random = new Random();
        int x = random.nextInt(101);
        System.out.println("Текущее число: " + x);
        Scanner scan = new Scanner(System.in);
        int y;
            while (counter < 100) {
            counter++;
            System.out.println("введите переменную y:");
            y = scan.nextInt();



        if (x == y)  {
            break;

        } else if (x > y) {
            System.out.print("Задуманное число больше, чем Вы предполагаете");
        }  else {
            System.out.print("Задуманное число меньше, чем Вы предполагаете");
        }}
    }
}
