package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sInt1 = reader.readLine();
        String sInt2 = reader.readLine();
        String sInt3 = reader.readLine();

        int a = Integer.parseInt(sInt1);
        int b = Integer.parseInt(sInt2);
        int c = Integer.parseInt(sInt3);

        if (a == b && a == c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (a == c) {
            System.out.println(a + " " + c);
        } else if (b == c) {
            System.out.println(b + " " + c);
        }
    }
}