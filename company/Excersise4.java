package com.company;

import java.util.Scanner;

public class Excersise4 {
    public Excersise4(){
        System.out.println("#4");
        int x, y, z, v;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sheiyvanet samnishna ricxvi");
        x = scanner.nextInt();
        y = x%10;
        z = x/100;
        v = x%100/10;
        System.out.println(z);
        System.out.println(v);
        System.out.println(y);
    }
}
