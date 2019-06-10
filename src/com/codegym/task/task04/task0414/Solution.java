package com.codegym.task.task04.task0414;

/* 
Number of days in the year
- A leap year is 366 days, but an ordinary year is 365 days.
1) if the year is evenly divisible by 400, then it is a leap year;
2) for other years, if the year is evenly divisible by 100, then it is a regular year;
3) for other years, if the year is evenly divisible by 4, then it is a leap year;
4) all remaining years are not leap years.
Thus, the years 1700, 1800, and 1900 are not leap years, since they are multiples of 100 but not 400.
The years 1600 and 2000 are leap years, since they are multiples of 100 and multiples of 400.
The years 2100, 2200 and 2300 are not leap years.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sYear = reader.readLine();
        int year = Integer.parseInt(sYear);

        String phrase = "Number of days in the year: ";
        int leapYear = 366;
        int nonLeapYear = 365;

        if (year % 400 == 0) {
            System.out.println(phrase + leapYear);
        } else if (year % 100 == 0) {
            System.out.println(phrase + nonLeapYear);
        } else if (year % 4 == 0) {
            System.out.println(phrase + leapYear);
        } else {
            System.out.println(phrase + nonLeapYear);
        }
    }
}