class Solution {
    public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];        
    }
    public static void main(String [] args){
        int [] nums={3,4,5,1,2};
        System.out.println(findMin(nums));
    }
}