package com.codegym.task.task04.task0415;

/* 
Rule of the triangle
-A triangle can exist only if the sum of any two of its sides is greater than the third side.
- You need to compare each side with the sum of the other two.
- If even one side is larger than the sum of the other two sides, then no such triangle exists.
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

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The triangle is possible.");
        } else {
            System.out.println("The triangle is not possible.");
        }
    }
}