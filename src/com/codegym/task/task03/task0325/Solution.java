package com.codegym.task.task03.task0325;

import java.io.*;
import java.util.Scanner;

/* 
Financial expectations

*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        String phrase = "I will earn $" + n + " per hour";
//
//        System.out.println(phrase);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        int num = Integer.parseInt(n);

        String phrase = "I will earn $" + num + " per hour";

        System.out.println(phrase);
    }
}
