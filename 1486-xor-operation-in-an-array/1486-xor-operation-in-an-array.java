class Solution {
    public static int xorOperation(int n, int start) {
        int [] arr=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]=start + 2 * i;
        }
        int ans=0;
        for (int i = 0; i <n; i++) {
            ans^=arr[i];
        }
        return ans;
    }

    // public static void main(String[] args) {
    //     System.out.println(xorOperation(5,0));
    // }
}