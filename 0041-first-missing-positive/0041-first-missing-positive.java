class Solution {
    public static void swap(int [] nums,int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public static void cyclicsort(int [] nums){
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]<=0){
                i++;
            }
            else if (nums[i] <= nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
    }
    public static int firstMissingPositive(int[] nums) {
        cyclicsort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }

    // public static void main(String[] args) {
    //     int [] nums={1,2,0};
    //     System.out.println(firstMissingPositive(nums));
    // }
}