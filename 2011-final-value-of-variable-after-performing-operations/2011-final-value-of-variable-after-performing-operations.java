class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("+")){
                x++;
            }else {
                x--;
            }
        }
        return x;
    }

    // public static void main(String[] args) {
    //     System.out.println(finalValueAfterOperations(new String []{"++X","++X","X++"}));
    // }
}