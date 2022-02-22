package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n, k, z, ams;

        System.out.print("Number of apples: ");
        Scanner in =new Scanner(System.in);
        k = in.nextInt();

        System.out.print("Number of students: ");
        n = in.nextInt();

        z = k % n;
        ams = n - z;

        System.out.print(ams);

    }
}
