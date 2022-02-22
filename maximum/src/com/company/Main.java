package com.company;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int a, b, answ;

        System.out.print("Enter the first number: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        System.out.print("Enter the second number: ");
        b = in.nextInt();

        answ = (a * (a / b) + b * (b / a)) / (b / a + a / b);

        System.out.print("The biggest number is: " + answ);

    }
}
