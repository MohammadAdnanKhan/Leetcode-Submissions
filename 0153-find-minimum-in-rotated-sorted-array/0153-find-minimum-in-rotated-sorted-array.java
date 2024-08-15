class Solution {
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];        
    }
  
}