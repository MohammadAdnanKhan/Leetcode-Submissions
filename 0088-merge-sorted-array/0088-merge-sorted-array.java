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
        for (int i = 0; i <nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
        Arrays.sort(nums1);
        System.out.println();
        for (int i = 0; i <nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] nums1={-1,0,0,3,3,3,0,0,0};
        int [] nums2={1,2,2};
        int m=nums1.length;
        int n=nums2.length;
        merge(nums1,m,nums2,n);
    }
}