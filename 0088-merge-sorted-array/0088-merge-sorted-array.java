class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        if (nums2.length>0){
        for (int i = nums1.length-1; i > nums1.length-nums2.length-1; i--) {
            if (nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
            }
        }}
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int [] nums1={1};
        int [] nums2={};
        int m=nums1.length;
        int n=nums2.length;
        merge(nums1,m,nums2,n);
    }
}