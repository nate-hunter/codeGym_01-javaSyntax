package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int numHundreds = number / 100;
        int numTens = (number / 10) - (numHundreds * 10);
        int numOnes = number - (numHundreds * 100 + numTens * 10);

        return numHundreds + numTens + numOnes;
    }
}