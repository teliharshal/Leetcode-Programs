package com.code;
//https://leetcode.com/problems/richest-customer-wealth/description/

public class maxWealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,6,7},{5,8,9}};
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {

        int Max = Integer.MIN_VALUE;

        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > Max) {
                Max = sum;
            }
        }
        return Max;
    }


}
