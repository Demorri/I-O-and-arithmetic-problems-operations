package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	int d, m, n;

    System.out.print("Route length: ");
    Scanner a = new Scanner(System.in);
    m = a.nextInt();

    System.out.print("Daily route: ");
    Scanner b = new Scanner(System.in);
    n = a.nextInt();

    d = (m - 1 + n) / n;
    System.out.print("You will need " + d + " days.");

    }
}
