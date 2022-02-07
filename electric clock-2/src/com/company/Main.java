package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        int min, hours, sec;
        System.out.print("Enter the seconds: ");
        Scanner a = new Scanner(System.in);
        sec = a.nextInt();

        hours = sec % (3600 * 1440) / 3600;
        min = sec % (60 * 60) / 60;
        sec = sec % 60;

        System.out.print(String.format( "The time is: " + "%d:%02d:%02d", hours, min, sec));
    }


}



