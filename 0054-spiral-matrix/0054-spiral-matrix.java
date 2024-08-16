class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> list=new ArrayList<>();
        int startrow=0,startcol=0,endrow= matrix.length-1,endcol=matrix[0].length-1;
        while (startrow<=endrow && startcol<=endcol){
            for (int i = startcol; i <=endcol; i++) {
                list.add(matrix[startrow][i]);
            }
            for (int i = startrow+1; i <=endrow ; i++) {
                list.add(matrix[i][endcol]);
            }
            for (int i = endcol-1; i>=startcol ; i--) {
                if(startrow==endrow){break;}
                list.add(matrix[endrow][i]);
            }
            for (int i = endrow-1; i>=startrow+1 ; i--) {
                if(startcol==endcol){break;}
                list.add(matrix[i][startcol]);
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        return list;
    }

    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}