package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    public static int convertToSeconds(int hour) {
        int seconds = hour * 60 * 60;
        return seconds;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(5));
    }
}
