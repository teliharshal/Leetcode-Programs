package com.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindNoinArray {

    public static void main(String[] args) {
        int[][] arr = {{39, 75, 24, 90},
                {95, 39, 78, 77, 95},
                {13, 26, 89, 55}};
        int target = 6;
        int[] ans = findNoinArray(arr,target);
        System.out.println(Arrays.toString(ans));

        System.out.println(Maximum(arr));
    }

    public static int Maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] Ints: arr) {
            for (int ansInt: Ints) {
                if (ansInt > max) {
                    max = ansInt;
                }
            }

        }
        return max;
    }

    public static int[] findNoinArray(int[][] arr,int target) {

        for(int row=0; row<arr.length ; row++)
        {
            for(int col=0; col<arr[row].length ; col++)
            { if(arr[row][col]==target)
                return new int[]{row,col};
            }
        }
    return new int[] {-1,-1};
    }

}
