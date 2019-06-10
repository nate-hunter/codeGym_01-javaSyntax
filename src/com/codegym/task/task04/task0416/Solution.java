package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sT = reader.readLine();
        double t = Double.parseDouble(sT);

        double testT;   // variable to test condition of t value (if greater than or equal to 5: set to t, otherwise set to its remainder when divided by 5);

        if (t < 5) {
            testT = t;
        } else {
            testT = t % 5.0;
        }

        if (testT < 3) {
            System.out.println("green");
        } else if (testT < 4) {
            System.out.println("yellow");
        } else {
            System.out.println("red");
        }
    }
}