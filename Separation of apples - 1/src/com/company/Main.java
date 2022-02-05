package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n, k, apls;
    Scanner num = new Scanner(System.in);
    System.out.print("Enter the amount of apples: ");
    k = num.nextInt();
    System.out.print("Enter the number of pupils: ");
    n = num.nextInt();
    apls = k / n;
    System.out.println("The amount of apples for each kid is: " + apls);
    }
}
