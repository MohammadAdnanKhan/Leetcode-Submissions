class Solution {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length/2; j++) {
                int temp=image[i][j];
                image[i][j]=image[i][image[0].length-1-j];
                image[i][image[0].length-1-j]=temp;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                image[i][j]= image[i][j]^1;
            }
        }
        return image;
    }


    // public static void main(String[] args) {
    //     int [][] image={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
    //     flipAndInvertImage(image);
    //     for (int i = 0; i < image.length; i++) {
    //         for (int j = 0; j < image[0].length; j++) {
    //             System.out.print(image[i][j]);
    //         }
    //         System.out.println();
    //     }
    // }
}