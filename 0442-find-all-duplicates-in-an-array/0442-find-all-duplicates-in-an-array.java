class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while (i<nums.length-1){
            if (nums[i]==nums[i+1]){
                list.add(nums[i]);
                i=i+2;
            }else {
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}