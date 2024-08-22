class Solution {
    public static int pivotidx(int [] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (mid<end && nums[mid]>nums[mid+1]){
                return mid;
            } else if (mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            } else if (nums[start]==nums[mid] && nums[mid]==nums[end]) {
                if (nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if (nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end])
                    {start=mid+1;}
                    else{
                        end=mid-1;
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
    public static boolean search(int[] nums, int target) {
        int pivot=pivotidx(nums);
        int leftsearch=ascendingbinarysearch(nums,target,0,pivot);
        int rightsearch=ascendingbinarysearch(nums,target,pivot+1,nums.length-1);
        if (leftsearch!=-1){
            return true;
        } else if (rightsearch!=-1) {
            return true;
        }
        else {
            return false;
        }
    }

    // public static void main(String[] args) {
    //     int [] nums={1,0,1,1,1};
    //     int target=0;
    //     System.out.println(search(nums,target));
    // }
}