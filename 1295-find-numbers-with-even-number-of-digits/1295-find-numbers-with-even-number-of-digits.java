class Solution {
    public static int noofdigits(int num){
        int count=0;
        while (num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if (noofdigits(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums={1,34,96};
        System.out.println(findNumbers(nums));
    }
}