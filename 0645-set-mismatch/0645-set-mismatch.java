class Solution {
    public static void swap(int [] nums,int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public static int [] cyclicsort(int [] nums){
        int [] output=new int[2];
        int i=0;
        while (i< nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j <nums.length; j++) {
            if (nums[j]!=j+1){
                output[0]=nums[j];
                output[1]=j+1;
            }
        }
          return output;
    }
    public static int[] findErrorNums(int[] nums) {
        return cyclicsort(nums);
    }

    // public static void main(String[] args) {
    //     int [] nums={1,2,2,4};
    //     int [] output =findErrorNums(nums);
    //     for (int i = 0; i < output.length; i++) {
    //         System.out.print(output[i]+" ");
    //     }
    // }
}