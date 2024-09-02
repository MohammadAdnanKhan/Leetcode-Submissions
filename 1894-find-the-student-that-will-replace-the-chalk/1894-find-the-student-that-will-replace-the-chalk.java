class Solution {
    public static int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        for (int c : chalk) {
            totalChalk += c;
        }
        
        k %= totalChalk; 
        
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }
        
        return -1; 
    }

    public static void main(String[] args) {
        int chalk[] = {5, 1, 5};
        int k = 22;
        System.out.println(chalkReplacer(chalk, k)); 
    }
}

