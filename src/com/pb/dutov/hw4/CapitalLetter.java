package com.pb.dutov.hw4;
import java.util.Scanner;


public class CapitalLetter {
    static void procedure() {
        String x, y = "";
        Scanner scan = new Scanner(System.in);
        x = scan.nextLine();
        y = y + x.substring(0, 1).toUpperCase();
        {for (int i = 1; i < x.length(); i++) {
            if (" ".equals(x.substring(i - 1, i)))
                y = y + x.substring(i, i + 1).toUpperCase();
            else
                y = y + x.substring(i, i + 1);
        }
    }
        System.out.print(y);
    }
    public static void main(String[]args) {
        procedure();
    }

}