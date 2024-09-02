class Solution {
    public static int reverse(int x) {
        int y = 0, z;
        while (x != 0) {
            z = x % 10;
            if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && z > 7)) {
                return 0;
            }
            if (y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && z < -8)) {
                return 0;
            }

            y = y * 10 + z;
            x = x / 10;
        }
        return y;
    }

    // public static void main(String[] args) {
    //     System.out.println(reverse(1463847412));
    // }
}
