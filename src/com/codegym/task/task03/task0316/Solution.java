package com.codegym.task.task03.task0316;

/* 
Escaping characters

*/

public class Solution {
    public static void main(String[] args) {
        String textWindows = "This is a Windows path: \"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"";
        String textJava = "This is a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.8.0_172\\\\bin\\\"";

        System.out.println(textWindows);
        System.out.println(textJava);

    }
}
