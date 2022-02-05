package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num;
        System.out.print("Enter integer from -10000 to 10000: ");
        num = a.nextInt();
        System.out.println("The next number for the number " + num + " is " + num + "+1=" + (num+1) + ".");
        System.out.println("The previous number for the number " + num + " is " + num + "-1=" + (num-1) + ".");

    }
}
