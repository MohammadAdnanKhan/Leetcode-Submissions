class Solution {
    public static int scoreOfString(String s) {
        int i=0;
        int ans=0;
        while (i<s.length()-1){
            ans+=Math.abs(s.charAt(i+1)-s.charAt(i));
            i++;
        }
        return ans;
    }

    // public static void main(String[] args) {
    //     System.out.println(scoreOfString("hello"));
    // }
}