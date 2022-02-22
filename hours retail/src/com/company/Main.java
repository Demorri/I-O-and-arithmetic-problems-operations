package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	int h, m, s, ret, cSec1, cSec2;

    System.out.println("Please, enter the time of the first moment");

    System.out.print("Enter hours: ");
    Scanner in = new Scanner(System.in);
    h = in.nextInt();

    System.out.print("Enter minutes: ");
    m = in.nextInt();

    System.out.print("Enter seconds: ");
    s = in.nextInt();

    cSec1 = h * 3600 + m * 60 + s;

    System.out.println("Now enter the time of the second moment");

    System.out.print("Enter hours: ");
    h = in.nextInt();

    System.out.print("Enter minutes: ");
    m = in.nextInt();

    System.out.print("Enter seconds: ");
    s = in.nextInt();

    cSec2 = h * 3600 + m * 60 + s;

    ret = cSec2 - cSec1;
    System.out.println("Seconds have passed: " + ret);

    }


}
