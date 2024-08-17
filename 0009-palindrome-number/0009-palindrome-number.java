class Solution {
    public static boolean isPalindrome(int x) {
        int m=x;
        int n=x;
        int tomultiply,reverse=0,tenmultiply=1;
        while (m >= 10) {
            tenmultiply *= 10;
            m /= 10;
        }
        while (x>0){
            tomultiply=x%10;
            reverse += (tomultiply*tenmultiply);
            tenmultiply=tenmultiply/10;
            x=x/10;
        }
        if (n!=reverse){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}