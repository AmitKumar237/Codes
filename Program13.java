// https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result [] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(j < m && k < n){
            if(nums1[j] < nums2[k]){
                result[i] = nums1[j];
                j++;
                i++;
            }else{
                result[i] = nums2[k];
                k++;
                i++;
            }
        }
        
        while(j < m){
            result[i] = nums1[j];
            j++;
            i++;
        }
        
        while(k < n){
            result[i] = nums2[k];
            k++;
            i++;
        }
        
        for(i=0 ; i < result.length ; i++){
            nums1[i] = result[i];
        }
    }
}