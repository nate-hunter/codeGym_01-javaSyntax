package com.codegym.task.task04.task0410;

/* 
Come on, lucky seven!
- Write the checkInterval method.
- The method should check whether an integer is in the range from 50 to 100  and display the result on the screen as follows:
- "The number a is not in the interval." or
- "The number a is in the interval.", where a is the method argument.
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
        checkInterval(75);
        checkInterval(50);
    }

    public static void checkInterval(int a) {
        if (a < 100 && a > 50) {
            System.out.println("The number " + a + " is in the interval.");
        } else {
            System.out.println("The number " + a + " is not in the interval.");
        }
    }
}