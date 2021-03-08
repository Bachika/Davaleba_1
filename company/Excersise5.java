package com.company;

import java.util.Scanner;

public class Excersise5 {
    public Excersise5(){
        System.out.println("#5");
        int x, y, z, v, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sheiyvanet otxnishna ricxvi");
        x = scanner.nextInt();
        z = x/1000;
        b = x/100%10;
        y = x%100/10;
        v = x%10;
        System.out.println(z);
        System.out.println(b);
        System.out.println(y);
        System.out.println(v);
    }
}
