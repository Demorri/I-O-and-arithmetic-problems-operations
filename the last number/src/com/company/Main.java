package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num;
    Scanner a = new Scanner(System.in);
    System.out.print("Enter the number: ");
    num = a.nextInt();
    num = num % 10;
    System.out.print("The last number is: " + num);

    }
}
