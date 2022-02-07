package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int  lesson, t;

        Scanner a = new Scanner(System.in);
        lesson = a.nextInt();

        lesson = lesson * 45 + (lesson / 2) * 5 + ((lesson+1) / 2 - 1) * 15;
        System.out.print("The end of the lessons: " + (lesson / 60 + 9) + " h and " + lesson % 60 + " m. ");
    }
}
