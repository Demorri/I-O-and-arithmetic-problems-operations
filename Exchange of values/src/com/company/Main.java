package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    int a, b;

        System.out.print("Enter the A number: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        b = a;

        System.out.print("Enter B number: ");    
        a = in.nextInt();

        System.out.print(a + " " + b);

    }
}
