package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    int a, b;

        System.out.print("Enter the A number: ");
        Scanner num1 = new Scanner(System.in);
        a = num1.nextInt();

        b = a;

        System.out.print("Enter B number: ");
        Scanner num2 = new Scanner(System.in);
        a = num2.nextInt();

        System.out.print(a + " " + b);

    }
}
