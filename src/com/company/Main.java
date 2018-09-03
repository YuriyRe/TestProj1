package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int A;
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите а \n");
        a = input.nextInt();
        System.out.printf("Введите А \n");
        A = input.nextInt();
        double d = 5.5;
        int f = a + ((int)d);
        double i = ((double)A) + d;
        System.out.println(plus(a, A) + "|" + f + "|" + i);
        if(a == A)
        System.out.printf("\n Введены одинаковые числа");
        else
            System.out.printf("\n Введены неодинаковые числа");
    }
    static public int plus (int a, int A)
    {
        return a+A;
    }
}