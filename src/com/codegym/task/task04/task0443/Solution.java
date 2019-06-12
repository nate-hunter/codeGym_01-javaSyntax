package com.codegym.task.task04.task0443;


/* 
A name is a name
- output:
    My name is Kevin.
    I was born on 2/15/1988
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int yyyy = Integer.parseInt(reader.readLine());
        int mm = Integer.parseInt(reader.readLine());
        int dd = Integer.parseInt(reader.readLine());


        String phraseName = "My name is " + name + ".";
        String phraseBirth = "I was born on " + mm + "/" + dd + "/" + yyyy;

        System.out.println(phraseName);
        System.out.println(phraseBirth);


    }
}
