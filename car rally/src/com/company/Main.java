package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	int d, m, n;

    System.out.print("Route length: ");
    Scanner in = new Scanner(System.in);
    m = in.nextInt();

    System.out.print("Daily route: ");
    n = in.nextInt();

    d = (m - 1 + n) / n;
    System.out.print("You will need " + d + " days.");

    }
}
