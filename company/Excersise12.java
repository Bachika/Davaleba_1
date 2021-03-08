package com.company;

import java.util.*;

public class Excersise12 {
    public Excersise12(){
        System.out.println("#12");
        int m[] = new int[8];
        Random random = new Random();
        for(int i=0; i<m.length; i++){
            m[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(m));
        Arrays.sort(m);
        System.out.println("sorted");
//        System.out.println(Arrays.toString(m));
        Collections.reverse(Arrays.asList(m));
        System.out.println(Arrays.toString(m));
        for(int i=0; i<m.length/2; i++){
            int tmp = m[i];
            m[i]=m[m.length-1-i];
            m[m.length-1-i] = tmp;

        }
        System.out.println("klebadobit");
        System.out.println(Arrays.toString(m));
    }
}