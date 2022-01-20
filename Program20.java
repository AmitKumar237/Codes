// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits

class Solution {
    public int[] sortByBits(int[] arr) {
        if(arr.length == 1){
            return arr;
        }

        int [] result = new int[arr.length];
        Arrays.sort(arr);
        int count = 1;
        int i = 0;
        int j = 0;
        if(arr[0] == 0){
            result[0] = 0;
            i++;
            j++;
        }

        while(result[result.length - 1] == 0){
            for( ; j < arr.length ; j++){
                if(count(arr[j]) == count){
                    result[i] = arr[j];
                    i++;
                }
            }
            count++;
            j = 0;
        }

        return result;
    }
    
    public int count(int n){
        int count = 0;
        while(n > 0){
            if((n&1) == 1)
                count++;
            n >>= 1;
        }
        return count;
    }
}