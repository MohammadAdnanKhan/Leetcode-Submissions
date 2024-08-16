public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int [] answer=new int[nums.length];
        answer[0]=1;
        for (int i = 1; i < nums.length; i++) {
            answer[i]=nums[i-1]*answer[i-1];
        }
        int suffixpdt=1;
        for (int i = nums.length-1; i >=0; i--) {
            answer[i]=answer[i]*suffixpdt;
            suffixpdt*=nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] nums={-1,1,0,-3,3};
        int [] output=productExceptSelf(nums);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }
    }}