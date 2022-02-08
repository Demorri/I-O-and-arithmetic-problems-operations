package com.company;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int a, b, answ;

        System.out.print("Enter the first number: ");
        Scanner z = new Scanner(System.in);
        a = z.nextInt();

        System.out.print("Enter the second number: ");
        Scanner x = new Scanner(System.in);
        b = x.nextInt();

        answ = (a * (a / b) + b * (b / a)) / (b / a + a / b);

        System.out.print("The biggest number is: " + answ);

    }
}
