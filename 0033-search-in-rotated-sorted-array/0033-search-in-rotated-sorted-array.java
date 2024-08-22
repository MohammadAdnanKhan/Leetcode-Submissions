   public class Solution {
       public static int pivotidx(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            } else if (mid >start && arr[mid]<arr[mid-1]) {
                return mid-1;
            } else if (arr[mid]<=arr[start]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static int ascendingbinarysearch(int [] arr,int target,int start, int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int maxidx=pivotidx(nums);
        int leftsearch=ascendingbinarysearch(nums,target,0,maxidx);
        if (leftsearch!=-1){
            return leftsearch;
        }
        else {
            return ascendingbinarysearch(nums,target,maxidx+1, nums.length-1);
        }
    }

    public static void main(String[] args) {
        int [] nums={5,1,3};
        int target=5;
        System.out.println(search(nums,target));
    }
}