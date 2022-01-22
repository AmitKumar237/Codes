// https://leetcode.com/problems/complement-of-base-10-integer/

class Solution {
    public int bitwiseComplement(int n) {
        int l = (int)(Math.log(n)/Math.log(2)) + 1;
        int r = n ^ ((1<<l) - 1);
        return r;
    }
}