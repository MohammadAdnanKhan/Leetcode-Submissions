public class Solution {
    public static int search(int[] nums, int target) {
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums={1,2};
        int target=2;
        System.out.println(search(nums,target));
    }
}