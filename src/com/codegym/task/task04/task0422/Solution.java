package com.codegym.task.task04.task0422;

/* 
18+

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);

        String phrase = "Grow up a little more";

        if (age < 18) {
            System.out.println(phrase);
        }
    }
}
