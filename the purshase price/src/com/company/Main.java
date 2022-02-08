package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a, b, n;

        System.out.print("Enter the value of rubles for one pie: ");
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        System.out.print("Enter the value of kopecks for one pie: ");
        Scanner c = new Scanner(System.in);
        b = c.nextInt();
        System.out.print("Enter the number of pies: ");
        Scanner z = new Scanner(System.in);
        n = z.nextInt();

        a *= n;
        b *= n;

        for (; b > 99; b -= 100) {
            a += 1;
        }

        System.out.println("The price will be: " + a + " " + b);


    }
}
