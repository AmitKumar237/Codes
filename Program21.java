// https://leetcode.com/problems/koko-eating-bananas/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 1000000000;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            int temp = tempResult(piles , mid);
            
            if(temp > h)
                start = mid + 1;
            else
                end = mid - 1;
            
        }
        
        return start;
    }
    
    public int tempResult(int [] piles , int rate){
        
        int  h = 0;
        
        for(int pile : piles){
            h += pile/rate;
            
            if(pile % rate != 0)
                h++;
        }
        
        return h;
    }
}