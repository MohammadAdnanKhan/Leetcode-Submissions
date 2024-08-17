class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> isMax = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <candies.length ; i++) {
            if (candies[i]>max){
                max=candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies>=max){
                isMax.add(true);
            }
            else {
                isMax.add(false);
            }
        }
        return isMax;
    }

    public static void main(String[] args) {
        int [] candies={4,2,1,1,2};
        int extracandies=1;
        System.out.println(kidsWithCandies(candies,extracandies));
    }
}