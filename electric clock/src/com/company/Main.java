package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int min, hours;
        System.out.print("Enter the minutes: ");
        Scanner a = new Scanner(System.in);
        min = a.nextInt();

        hours = min % (60 * 24) / 60;
        min = min % 60;

        System.out.print("It is " + hours + " hours and " + min + " minutes.");
    }
}
