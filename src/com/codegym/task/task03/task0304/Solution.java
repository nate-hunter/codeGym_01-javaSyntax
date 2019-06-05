package com.codegym.task.task03.task0304;

/* 
Task with percentages

*/

public class Solution {
    public static double addTenPercent(int i) {
        double num = i + (i * .1);
        return num;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
