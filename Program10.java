class Solution {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        int i = 0 , j = 2;
        while(j < s.length()){
            if(check(s,j))
                ans++;
            j++;
            i++;
        }
        return ans;
    }
    
    public boolean check(String s , int j){
        if(s.charAt(j) != s.charAt(j-1) && s.charAt(j) != s.charAt(j-2) && s.charAt(j - 1) != s.charAt(j-2))
            return true;
        return false;
    }
}