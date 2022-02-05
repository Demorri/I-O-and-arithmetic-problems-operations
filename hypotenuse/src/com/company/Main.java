package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double result, a, b;

        Scanner num = new Scanner(System.in);
        System.out.print("Введите значение катета А = ");
        a = num.nextInt();
        System.out.print("Введите значение катета B = ");
        b= num.nextInt();
        result = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print("Гипотенуза = " + result);
    }
}
