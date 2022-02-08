
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int h, a, b, days;

        System.out.print("The height of pillar: ");
        Scanner z = new Scanner(System.in);
        h = z.nextInt();

        System.out.print("Daily moving up: ");
        Scanner x = new Scanner(System.in);
        a = x.nextInt();

        System.out.print("Daily moving down: ");
        Scanner c = new Scanner(System.in);
        b = c.nextInt();

        h -= a;
        a -= b;
        days = h / a + 1;

        System.out.print(days);

    }
}
