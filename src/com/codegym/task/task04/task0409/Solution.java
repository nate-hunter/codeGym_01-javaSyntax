package com.codegym.task.task04.task0409;

/* 
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 12);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int distA = 10 - a;
        int distB = 10 - b;

        if (abs(distA) < abs(distB)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

//        System.out.println(distA + " vs. " + distB);
//        System.out.println(abs(distA) + " versus " +abs(distB));
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}