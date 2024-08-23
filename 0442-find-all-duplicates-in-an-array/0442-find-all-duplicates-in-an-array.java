class Solution {
    public static void swap(int [] nums,int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public static List<Integer> cyclicsort(int [] nums){
        List<Integer> list=new ArrayList<>();
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j+1){
                list.add(nums[j]);
            }
        }
        return list;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        return cyclicsort(nums);
    }

    // public static void main(String[] args) {
    //     int [] nums={4,3,2,7,8,2,3,1};
    //     System.out.println(findDuplicates(nums));
    // }
}