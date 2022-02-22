
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int h, a, b, days;

        System.out.print("The height of pillar: ");
        Scanner in = new Scanner(System.in);
        h = in.nextInt();

        System.out.print("Daily moving up: ");
        a = in.nextInt();

        System.out.print("Daily moving down: ");
        b = in.nextInt();

        h -= a;
        a -= b;
        days = h / a + 1;

        System.out.print(days);

    }
}
