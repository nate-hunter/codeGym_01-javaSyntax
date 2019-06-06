package com.codegym.task.task03.task0320;


/* 
The humble programmer

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        String phrase = name + " makes $120,000 a year. Ha-ha-ha!";
        System.out.println(phrase);
    }
}
