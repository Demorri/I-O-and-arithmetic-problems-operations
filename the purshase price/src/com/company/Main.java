package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a, b, n;

        System.out.print("Enter the value of rubles for one pie: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
	    
        System.out.print("Enter the value of kopecks for one pie: ");
        b = in.nextInt();
	    
        System.out.print("Enter the number of pies: ");
        n = in.nextInt();

        a *= n;
        b *= n;

        for (; b > 99; b -= 100) {
            a += 1;
        }

        System.out.println("The price will be: " + a + " " + b);


    }
}
