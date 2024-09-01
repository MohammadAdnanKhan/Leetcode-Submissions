public class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int output[][]=new int[m][n];
        if (m*n != original.length){
            return new int[0][0];
        }
        else{
            int k=0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j <n; j++) {
                    output[i][j]=original[k++];
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int [] original={1,2,3,4};
        int[][]output=construct2DArray(original,2,2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }
    }
}