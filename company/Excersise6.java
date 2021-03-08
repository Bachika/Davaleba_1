package com.company;

import java.util.Scanner;

public class Excersise6 {
    public Excersise6(){
        System.out.println("#6");
        int x, s=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("X=");
        x = scanner.nextInt();
        while(x!=0){
            s += x%10;
            x = x/10;
        }
        System.out.println("S="+s);
    }
}
