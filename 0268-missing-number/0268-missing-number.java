class Solution {
    public static void swap(int [] nums, int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i];
            if (nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
}
