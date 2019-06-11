package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();

        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        int[] intArray = {a, b, c};

        int positiveInts = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 0) {
                positiveInts++;
            }
        }

        System.out.println(positiveInts);
    }
}
