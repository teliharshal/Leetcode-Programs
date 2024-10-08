//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {
     int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
     int target = 10;
     System.out.println(ans(arr, target));

    }
    static int ans(int[] arr,int target){

        int start = 0;
        int end=1;

        while(target > arr[end]){
            int temp = end+1;
            //double the size of box
            //end = end + sizeof the box (end - start+1)*2
            end = end + (end - start+1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr,int target ,int start , int end )
    {
        while (start <= end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]>target)
            {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
