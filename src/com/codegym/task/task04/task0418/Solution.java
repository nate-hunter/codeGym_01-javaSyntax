package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sInt1 = reader.readLine();
        String sInt2 = reader.readLine();

        int a = Integer.parseInt(sInt1);
        int b = Integer.parseInt(sInt2);

        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}