// https://leetcode.com/problems/find-peak-element/submissions/

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1)
            return 0;
        
        int ans = binarySearch(nums ,0 , nums.length - 1);
        if(ans != 0){
            return ans;               
        }
        
        if(nums[0] > nums[nums.length - 1])
            return 0;
        return nums.length - 1;

    }
    
    public static int binarySearch(int [] nums , int start , int end){
        int mid = start + (end - start) / 2;

        if (start >= end || mid == 0 || mid == nums.length - 1){
            return 0;
        }

        if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
            return mid;

        int ans = binarySearch(nums , start , mid);
        if (ans != 0){
            return ans;
        }else{
            ans =  binarySearch(nums , mid+1 , end);
        }
        return ans;
    }
    
}