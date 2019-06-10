package com.codegym.task.task04.task0424;

/* 
Three numbers

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

        int indexA = 1;
        int indexB = 2;
        int indexC = 3;

        if (a == b) {
            if (a != c) {
                System.out.println(indexC);
            }
        } else if (a == c) {
            if (a != b) {
                System.out.println(indexB);
            }
        } else if ( b == c) {
            if (c != a) {
                System.out.println(indexA);
            }
        }
    }
}
