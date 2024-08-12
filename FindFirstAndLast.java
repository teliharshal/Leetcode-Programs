import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstAndLast {

    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
    int[] ans = {-1, -1};
    //check first occurance of if target first
      int start = search(nums,target,true);
      int end = search(nums,target,false);
      ans[0] =start;
      ans[1] =end;
      return ans;
    }
    public static int  search(int[] nums , int target,boolean FirstIndex)
    {
        int ans = -1;
        int start =0;
        int end = nums.length-1;
        while (start <= end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>target)
            {
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                ans = mid;
                if(FirstIndex)
                {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

}
