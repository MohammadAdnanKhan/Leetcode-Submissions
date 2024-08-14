public class Solution {
public static int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
    int[] newDigits = new int[digits.length + 1];
    newDigits[0] = 1; 
    return newDigits;
    }
    public static void main(String[] args) {
        int[] array={1,9,9};
        int[] digits=plusOne(array);
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]+" ");
        }
    }
}