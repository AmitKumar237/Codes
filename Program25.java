// https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(!s.contains(" "))
            return s.length();
        else{
            int count = 0;
            for(int i=s.length() - 1 ; s.charAt(i) != ' '; i--)
               count++;
            return count;
        }
    }
}