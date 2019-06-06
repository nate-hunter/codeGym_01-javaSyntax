package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String sYears = scanner.nextLine();
        int years = Integer.parseInt(sYears);
        String name = scanner.nextLine();

        String phrase = name + " will take over the world in " + years + " years. Mwa-ha-ha!";
        System.out.println(phrase);
    }
}
