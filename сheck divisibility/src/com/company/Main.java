package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n, m, answ1, answ2;

        System.out.print("Enter the first number: ");
        Scanner a = new Scanner(System.in);
        n = a.nextInt();

        System.out.print("Enter the second number: ");
        Scanner b = new Scanner(System.in);
        m = a.nextInt();

        answ1 = n % m;
        answ2 = m % n;
        System.out.print("The answer is: " + answ1 * answ2 + 1);
    }
}
