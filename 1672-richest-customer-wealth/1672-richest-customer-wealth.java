class Solution {
    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int current=0;
            for (int j = 0; j < accounts[0].length ; j++) {
                current+=accounts[i][j];
            }
            if (current>max){
                max=current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] accounts={{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
}
