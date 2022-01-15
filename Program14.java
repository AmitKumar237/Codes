// https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
        long s = 1;
        long e = x;
        while(s <= e){
            long mid = s + (e - s) / 2;
            
            if(mid * mid == x)
                return (int)mid;
            
            if(mid * mid < x)
                s = mid + 1;
            else{
                e = mid - 1;
            }
        }
        
        return (int)e;
    }
}