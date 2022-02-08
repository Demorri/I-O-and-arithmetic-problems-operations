package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c, d, answ, f;

        System.out.print("Enter the 4 digit number: ");
        Scanner n = new Scanner(System.in);
        f = n.nextInt();

        a = f / 1000;
        b = f / 100 % 10;
        c = f / 10 % 10;
        d = f % 10;
        answ = (a - d)*(a - d) + (b - c)*(b - c) + 1;

        System.out.print("The Answer is: " + answ);

    }
}
