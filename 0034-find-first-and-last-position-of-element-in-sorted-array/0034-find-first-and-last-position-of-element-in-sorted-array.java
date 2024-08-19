public class Solution {
    public static int firstindex(int [] nums,int target, boolean first){
        int start=0;
        int ans = -1;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target>nums[mid]){
                start=mid+1;
            }else if (target<nums[mid]){
                end=mid-1;
            }else {
                ans=mid;
                if (first){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {
        int [] output=new int[2];

        output[0]=firstindex(nums,target,true);
        output[1]=firstindex(nums,target,false);

        return output;
    }

    public static void main(String[] args) {
        int [] nums={5,7,7,8,8,10};
        int [] output=searchRange(nums,6);
        for (int i = 0; i <2; i++) {
            System.out.print(output[i]+" ");
        }
    }}