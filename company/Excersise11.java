package com.company;

import java.util.*;

public class Excersise11 {
    public Excersise11() {
        System.out.println("#11");
        int m[] = new int[8];
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(m));
    }
}