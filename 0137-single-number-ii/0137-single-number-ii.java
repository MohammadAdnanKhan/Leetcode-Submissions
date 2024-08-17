class Solution {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int rep,i=0;
        while(i<nums.length-2){
            rep=0;
            if (nums[i]==nums[i+2]){rep++;
            i=i+2;}
            if (rep==0){
                return nums[i];
            }
            i++;
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int [] nums={2,2,3,2};
        System.out.println(singleNumber(nums));
    }
}