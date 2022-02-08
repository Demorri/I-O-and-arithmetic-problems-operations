package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	int h, m, s, ret, cSec1, cSec2;

    System.out.println("Please, enter the time of the first moment");

    System.out.print("Enter hours: ");
    Scanner a = new Scanner(System.in);
    h = a.nextInt();

    System.out.print("Enter minutes: ");
    Scanner b = new Scanner(System.in);
    m = a.nextInt();

    System.out.print("Enter seconds: ");
    Scanner c = new Scanner(System.in);
    s = a.nextInt();

    cSec1 = h * 3600 + m * 60 + s;

    System.out.println("Now enter the time of the second moment");

    System.out.print("Enter hours: ");
    Scanner d = new Scanner(System.in);
    h = a.nextInt();

    System.out.print("Enter minutes: ");
    Scanner e = new Scanner(System.in);
    m = a.nextInt();

    System.out.print("Enter seconds: ");
    Scanner f = new Scanner(System.in);
    s = a.nextInt();

    cSec2 = h * 3600 + m * 60 + s;

    ret = cSec2 - cSec1;
    System.out.println("Seconds have passed: " + ret);

    }


}
