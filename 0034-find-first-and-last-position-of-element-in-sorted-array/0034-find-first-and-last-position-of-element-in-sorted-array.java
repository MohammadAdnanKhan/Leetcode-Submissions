public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int [] output=new int [2];
        if (nums.length==0){
            output=new int[]{-1,-1};
        }
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]==target){
                output[0]=i;
                i=nums.length;
            }
            else{
                output[0]=-1;
            }
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i]==target){
                output[1]=i;
                i=-1;
            }
            else{
                output[1]=-1;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int [] nums={};
        int target=0;
        int [] output=searchRange(nums,target);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }
    }
}
