package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        double exchangeRate = 1.12;
        double shirt = convertEurToUsd(20, exchangeRate);
        double pants = convertEurToUsd(55, exchangeRate);
        System.out.println(shirt);
        System.out.println(pants);
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double usd = eur * exchangeRate;
        return usd;
    }
}
