package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);

        if (num > 0) {
            num *= 2;
            System.out.println(num);
        } else if (num < 0) {
            num += 1;
            System.out.println(num);
        } else {
            System.out.println(0);
        }
    }
}