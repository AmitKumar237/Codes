class Solution {

    public int[] twoSum(int[] numbers, int target) {
        for(int i=0 ; i <= numbers.length / 2 ; i++){
            int index = binarySearch(i+1, numbers.length - 1, target - numbers[i],numbers);
            if (index != -1){
                return new int[]{i+1,index+1};
            }
        }
        return new int[]{-1,-1};
    }

    public int binarySearch(int s , int e , int target, int [] arr){
        while(s <= e){
            int mid = s + (e - s)/2;

            if(arr[mid] == target)
                return mid;

            if(arr[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return -1;
    }
    
// ---------------------- Brute Force Solution ----------------------------------    
//     public int[] twoSum(int[] numbers, int target) {
//         for(int i=0 ; i < numbers.length ; i++){
//             int index = indexOf(i+1,target-numbers[i],numbers);
//             if(index != -1)
//                 return new int[]{i+1,index + 1};
//         }
//         return new int[]{-1,-1};
//     }
    
//     public int indexOf(int s , int target , int [] numbers){
//         for(int i=s ; i< numbers.length ; i++){
//             if(numbers[i] == target)
//                 return i;
//         }
//         return -1;
//     }
}