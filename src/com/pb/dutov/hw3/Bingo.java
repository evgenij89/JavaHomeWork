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
            System.out.println("\nВведите число от 0 100\nВведите 101 чтобы закончить игру:");
            y = scan.nextInt();
            if (x == y)  {
            System.out.println("Поздравляем, Вы угадали с " + counter + " попытки");
            break;
        } else if (x > y && (y >=0 && y<=100)) {
            System.out.println("Задуманное число больше, чем Вы предполагаете. ");
        }
        else if (x < y && (y >=0 && y<=100)) {
                System.out.println("Задуманное число меньше, чем Вы предполагаете. ");
        }
        else if (y == 101) {
            System.out.println ("Игра окончена");
            break;
        }
        else {
            System.out.print("Задуманное число должно быть от 0 до 100\nИгра окончена ");
            break;

        }}
    }

}
