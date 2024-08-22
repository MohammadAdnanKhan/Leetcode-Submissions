/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public static int peakIndexInMountainArray(MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (mountainArr.get(mid)<mountainArr.get(mid+1)){
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return end;
    }

    public static int ascendingbinarysearch(MountainArray mountainArr,int target,int start, int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mountainArr.get(mid)==target){
                return mid;
            }
            else if (mountainArr.get(mid)>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    
    public static int descendingbinarysearch(MountainArray mountainArr,int target,int start, int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mountainArr.get(mid)==target){
                return mid;
            }
            else if (mountainArr.get(mid)<target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int maxidx=peakIndexInMountainArray(mountainArr);
        int leftSearch = ascendingbinarysearch(mountainArr, target, 0, maxidx);
        if (leftSearch != -1) {
            return leftSearch;
        }
        return descendingbinarysearch(mountainArr, target, maxidx + 1, mountainArr.length()-1);
    }
}