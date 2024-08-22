class Solution {
    public static int[][] generateMatrix(int n) {
        int [][] array=new int [n][n];
        int startrow=0;
        int startcol=0;
        int endrow= array.length-1;
        int endcol=array[0].length-1;
        int m=1;
        while (startrow<=endrow && startcol<=endcol){
            //top
            for (int i = startcol; i <=endcol; i++) {
                array[startrow][i]=m;
                m++;
            }
            //right
            for (int i = startrow+1 ; i <=endrow ; i++) {
                array[i][endcol]=m;
                m++;
            }
            //bottom
            for (int i = endcol-1; i>=startcol  ; i--) {
                if (startrow==endrow){
                    break;
                }
                array[endrow][i]=m;
                m++;                
            }
            //left
            for (int i = endrow-1; i >startrow ; i--) {
                if (startcol==endcol){
                    break;
                }
                array[i][startcol]=m;
                m++;
            }
            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }
        return array;
    }
}