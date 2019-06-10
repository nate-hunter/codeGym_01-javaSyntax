package com.codegym.task.task04.task0425;

/* 
Target locked!
- Point (x,y) belongs to a quadrant if the following conditions are true:
/ for the first quadrant: x > 0 and y > 0;
/ for the second quadrant: x < 0 and y > 0;
/ for the third quadrant: x < 0 and y < 0;
/ for the fourth quadrant: x > 0 and y < 0.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sX = reader.readLine();
        String sY = reader.readLine();

        int x = Integer.parseInt(sX);
        int y = Integer.parseInt(sY);

        int quad1 = 1;
        int quad2 = 2;
        int quad3 = 3;
        int quad4 = 4;

        if (x > 0 && y > 0) {
            System.out.println(quad1);
        } else if (x < 0 && y > 0) {
            System.out.println(quad2);
        } else if (x < 0 && y < 0) {
            System.out.println(quad3);
        } else {
            System.out.println(quad4);
        }
    }
}
