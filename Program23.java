// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String str : operations)
            x = (str.charAt(1) == '-') ? (x - 1) : (x + 1);
        return x;
    }
}