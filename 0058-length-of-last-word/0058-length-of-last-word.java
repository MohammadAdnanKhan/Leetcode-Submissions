class Solution {
    public static int lengthOfLastWord(String s) {
        StringBuilder sb=new StringBuilder();
        int k=s.length()-1;
        while (k >= 0 && s.charAt(k) == ' ') {
            k--;
        }
        for (int i = k; i >=0; i--) {

            if(s.charAt(i)==' '){
                return sb.toString().length();
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().length();
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}