package com.code;
public class Main {
    public static void main(String[] args) {
        int[] nums = {11,2,14,17,10};
        int target = 14;
        int res= LinearSearch2(nums,target);
        int result= LinearSearch(nums,target);
        System.out.println(result);
        System.out.println(res);
        }

        //return a index if element found in array
        //otherwise return -1

         static  int LinearSearch2(int[] nums, int target) {
         for(int elements: nums)
         {
             if(elements == target)
                 return elements;
         }
         return Integer.MIN_VALUE;
         }
        static  int  LinearSearch(int[] nums,int target)
        {
            if(nums.length==0)
                return -1;
            for(int Index = 0; Index <nums.length; Index++)
            {
              if(nums[Index]==target)
                  return Index;
            }
            return Integer.MAX_VALUE;
        }
    }
