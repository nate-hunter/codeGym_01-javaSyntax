package com.codegym.task.task03.task0322;


/* 
Deep and pure love

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();

        String phrase = name1 + " + " + name2 + " + "  + name3 + " = Pure love. Ooo la-la!";
        System.out.println(phrase);
    }
}