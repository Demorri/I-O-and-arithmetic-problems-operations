package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n, k, z, ams;

        System.out.print("Number of apples: ");
        Scanner a =new Scanner(System.in);
        k = a.nextInt();

        System.out.print("Number of students: ");
        Scanner b =new Scanner(System.in);
        n = b.nextInt();

        z = k % n;
        ams = n - z;

        System.out.print(ams);

    }
}
