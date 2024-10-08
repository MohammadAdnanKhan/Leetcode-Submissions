class Solution {
    public static void swap(int [] nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public static int cyclicsort(int [] nums){
        int i=0;
        while (i<nums.length){
            int correct=nums[i];
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                return nums[correct];
            }
        }
        return -1;
    }
    public static int findDuplicate(int[] nums) {
        return cyclicsort(nums);
    }
    // public static void main(String[] args) {
    //     int [] nums={3,4,1,1,2};
    //     System.out.println(findDuplicate(nums));
    // }
}