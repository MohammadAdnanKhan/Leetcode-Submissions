public class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; Math.abs(i-j)<=k && j < nums.length ; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}