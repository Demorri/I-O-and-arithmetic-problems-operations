package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = a.nextInt();

        num = num / 10 % 10;

        System.out.print("The tens of number is: " + num);

    }
}
