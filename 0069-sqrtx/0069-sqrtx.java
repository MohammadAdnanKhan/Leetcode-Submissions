public class Solution{
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid; 
            if (sq == x) {
                return mid;
            } else if (sq < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
    // public static void main(String[] args) {
    //     System.out.println(mySqrt(77284935));
    // }
}