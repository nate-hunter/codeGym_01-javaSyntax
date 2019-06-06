package com.codegym.task.task01.task0131;

/* 
More conversions

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getFeetFromInches(243));
    }

    public static int getFeetFromInches(int inches) {
        int feet = inches / 12;
        return feet;
    }
}