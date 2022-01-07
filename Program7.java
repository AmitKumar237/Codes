// https://leetcode.com/problems/palindrome-number/solution/


class Solution {
    public boolean isPalindrome(int n) {
        int sum=0,num=n;
        while(n>0)
        {
            sum=sum*10+n%10;
            n=n/10;
        }
        return sum == num;
    }
}