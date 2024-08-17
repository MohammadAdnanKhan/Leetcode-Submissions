class Solution {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        if (word1.length()==word2.length()){
            for (int i = 0; i <word1.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }
        if (word1.length()>word2.length()){
            for (int i = 0; i <word2.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for (int i = word2.length(); i <word1.length() ; i++) {
                sb.append(word1.charAt(i));
            }

        }
        if (word1.length()<word2.length()){
            for (int i = 0; i <word1.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            for (int i = word1.length(); i <word2.length() ; i++) {
                sb.append(word2.charAt(i));
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }
}