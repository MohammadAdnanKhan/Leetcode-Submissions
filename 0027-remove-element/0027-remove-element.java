import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[n++] = nums[i];
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int newLength = removeElement(nums, val);
        System.out.println("New length: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
