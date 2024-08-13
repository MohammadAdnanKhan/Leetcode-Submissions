class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int j = 0;  
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) { 
                j++;
                nums[j] = nums[i];  
            }
        }
        for (int i = 0; i <= j; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println("Number of unique elements: " + removeDuplicates(nums));
    }
}
