package com.codegym.task.task04.task0442;


/* 
Adding

while (true) {
    int number = read the number;
    if (check whether the number is -1)
        break;
}
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        int sum = 0;

        while (n != -1) {
            String strInt = reader.readLine();
            n = Integer.parseInt(strInt);
            sum += n;

            if (n == -1) {
                System.out.println(sum);
                break;
            }
        }
    }
}
