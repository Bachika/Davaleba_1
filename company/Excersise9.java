package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Excersise9 {
    public Excersise9(){
        System.out.println("#9");
//            double m[] = new double[8];
            double m[] = {1.3, 0.4, 8, 0, -8.7, 2, 14.5, 7};
            for (int i=0; i<m.length; i++){
                System.out.println((i+1)+" - "+m[i]);
            }
         System.out.println("=====================");
            System.out.println(Arrays.toString(m));
            Arrays.sort(m);
            System.out.println(Arrays.toString(m));
            System.out.println("min="+m[0]);
            System.out.println("max="+m[7]);
            System.out.println("=====================");
            System.out.println("min="+Arrays.stream(m).min().getAsDouble());
            System.out.println("max="+Arrays.stream(m).max().getAsDouble());
    }
}