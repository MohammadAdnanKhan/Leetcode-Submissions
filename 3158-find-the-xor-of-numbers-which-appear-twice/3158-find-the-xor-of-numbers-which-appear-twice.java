class Solution {
    public static int duplicateNumbersXOR(int[] nums) {
        ArrayList <Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int j=0;
        int result=0;
        for (int i = 0; i <nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                list.add(nums[i]);
                j++;
            }
        }
        for (int i = 0; i <list.size(); i++) {
            result ^=list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums={1,1,2,2};
        System.out.println(duplicateNumbersXOR(nums));
    }
}