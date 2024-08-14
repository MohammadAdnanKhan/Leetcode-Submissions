class Solution {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                i++;
            }
            else {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int [] nums={1};
        singleNumber(nums);
    }
}