package com.company;

import java.util.Scanner;

public class Excersise8 {
    public Excersise8() {
        System.out.println("#8");
        Scanner scanner = new Scanner(System.in);
        int n, m;

        System.out.print("M=");
        m = scanner.nextInt();
        System.out.print("N=");
        n = scanner.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.println(i);
        }
    }
}