// https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0 , j = s.length() - 1;
        s = s.toLowerCase();
        while(i <= j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 < '0' || ch1 >'z' || (ch1 > '9' && ch1 < 'a')){
                i++;
                continue;
            }
            
            if(ch2 < '0' || ch2 >'z' || (ch2 > '9' && ch2 < 'a')){
                j--;
                continue;
            }
            
            if(ch1 != ch2)
                return false;
            i++;
            j--;
            
        }
        
        return true;
        
    }
}