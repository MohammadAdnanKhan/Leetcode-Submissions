public class Solution {
    public static boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String forward=sb.toString();
        String backward=sb.reverse().toString();
        return forward.equals(backward);
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}