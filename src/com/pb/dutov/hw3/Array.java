package com.pb.dutov.hw3;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[10];
        int count;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 10 елементов массива:");
        array[0] = scan.nextInt();
        array[1] = scan.nextInt();
        array[2] = scan.nextInt();
        array[3] = scan.nextInt();
        array[4] = scan.nextInt();
        array[5] = scan.nextInt();
        array[6] = scan.nextInt();
        array[7] = scan.nextInt();
        array[8] = scan.nextInt();
        array[9] = scan.nextInt();
        System.out.println("Ваш Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Сумма елементов массива:");
        System.out.println(array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9]);
        System.out.println("количество положительных елементов:");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0)
                sum += 1;
        }
            System.out.println(sum);
        System.out.println("сортировка массива:");
        boolean sort = false;
        int z;
        while(!sort) {
            sort = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    sort = false;

                    z = array[i];
                    array[i] = array[i+1];
                    array[i+1] = z;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
            }





