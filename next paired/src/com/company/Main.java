package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        int num, res, fckn;
        System.out.print("Enter the number: ");
        Scanner a = new Scanner(System.in);
        num = a.nextInt();

        res = num + (int) Math.pow(2, (num + 1) % 2);

        System.out.println( " " + res + " ");

    }
}
