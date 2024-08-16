class Solution {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        int j= words.length-1;
        for (int i = 0; i < words.length/2; i++) {
            String temp=words[i];
            words[i]=words[j];
            words[j]=temp;
            j--;
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <words.length; i++) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(reverseWords(s));
    }
}