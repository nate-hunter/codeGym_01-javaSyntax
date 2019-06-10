package com.codegym.task.task04.task0427;

/* 
Describing numbers
//- "even single-digit number" - if the number is even and has one digit,
//- "odd single-digit number" - if the number is odd and has one digit,
//- "even two-digit number" - if the number is even and has two digits,
//- "odd two-digit number" - if the number is odd and has two digits,
//- "even three-digit number" - if the number is even and has three digits,
//- "odd three-digit number" - if the number is odd and has three digits.
If the entered number does not fall in the range 1 - 999, don't display anything.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sInt = reader.readLine();
        int i = Integer.parseInt(sInt);

        if (i > 0 && i < 1000) {
            if (i % 2 == 0) {
                if (sInt.length() == 1){
                    System.out.println("even single-digit number");
                } else if (sInt.length() == 2) {
                    System.out.println("even two-digit number");
                } else if (sInt.length() == 3) {
                    System.out.println("even three-digit number");
                }
            } else {
                if (sInt.length() == 1){
                    System.out.println("odd single-digit number");
                } else if (sInt.length() == 2) {
                    System.out.println("odd two-digit number");
                } else if (sInt.length() == 3) {
                    System.out.println("odd three-digit number");
                }
            }
        }
    }
}
