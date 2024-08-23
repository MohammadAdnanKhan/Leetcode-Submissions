class Solution {
    public static void swap(int [] nums,int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public static void cyclicsort(int [] nums){
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        cyclicsort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i+1!=nums[i]){
                list.add(i+1);
            }
        }
        return list;
    }

    // public static void main(String[] args) {
    //     int [] nums={4,3,2,7,8,2,3,1};
    //     System.out.println(findDisappearedNumbers(nums));
    // }
}