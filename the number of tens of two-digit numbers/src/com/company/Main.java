package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int num;
        System.out.print("Enter two-digit number: ");
        Scanner a = new Scanner(System.in);
        num = a.nextInt();
        num = num / 10;
        System.out.println("The number of tens is: " + num);


    }
}
