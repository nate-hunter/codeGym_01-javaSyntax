package com.codegym.task.task01.task0134;

/* 
Fill a pool with water

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        int volumeMeters = a * b * c;
        int convertedLiters = volumeMeters * 1000;
        return convertedLiters;
    }
}