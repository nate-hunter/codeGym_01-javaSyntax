package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

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

        int[] numArray = {a, b, c};

        int posInt = 0;
        int negInt = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > 0) {
                posInt++;
            } else if (numArray[i] < 0) {
                negInt++;
            }
        }

        System.out.println("Number of positive numbers: " + posInt);
        System.out.println("Number of negative numbers: " + negInt);
    }
}
