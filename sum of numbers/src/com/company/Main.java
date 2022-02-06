package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the three-digit number: ");
        int num, sum = 0;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for ( ; num > 0; num /= 10)
            sum += num % 10;
        System.out.println("The sum of digits is: " + sum);
    }
}
