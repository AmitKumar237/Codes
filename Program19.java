// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        Arrays.sort(nums);
        int s = 0;
        int e = 1;
        
        while(e < nums.length){
            if(nums[s] != nums[e]){
                s = e;
            }    
            
            if((e - s + 1) > nums.length/2){
                return nums[s];
            }
            
            e++;
        }
        
        return -1;
    }
}