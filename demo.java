public class demo {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        ArrayList<Integer>list=new ArrayList<Integer>(0);
        int j=0;
        for(int i=0;i<n;i++){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
            }
            if(i==n-1){
                j++;
            }
        }
        return list;
    }
}
