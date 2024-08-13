class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] finalarray=new int[nums1.length+ nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            finalarray[i]= nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            finalarray[nums1.length+i]= nums2[i];
        }
        Arrays.sort(finalarray);
        if(finalarray.length % 2 == 1){
            return finalarray[finalarray.length/2];
        }
        else{
             return (finalarray[finalarray.length/2] + finalarray[finalarray.length/2 - 1]) / 2.0;

        }
    }
    public static void main(String[] args) {
        int [] nums1={1};
        int [] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}