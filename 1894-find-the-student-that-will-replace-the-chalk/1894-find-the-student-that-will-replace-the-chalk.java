class Solution {
    public static int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        
        // Calculate the total amount of chalk needed for one complete round
        for (int c : chalk) {
            totalChalk += c;
        }
        
        // Reduce k to be within one full round
        k %= totalChalk;
        
        // Determine which student will replace the chalk
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }
        
        // In theory, this should never be reached
        return -1;
    }

    public static void main(String[] args) {
        // Example test case
        int chalk[] = {5, 1, 5};
        int k = 22;
        System.out.println(chalkReplacer(chalk, k)); // Output should be 0
}
}
