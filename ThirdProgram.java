// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?fbclid=IwAR3goH8ySVkw2X83SWt48UsyAK3issiaazwVjoBmR6EqNlZCSSsjxUIxKxY#
// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // Mathod 1 : Just sort the array by the inbuilt function sort of Arrays
        // class which is a class of package java.util or directly access by
        // java.util.Arrays
        
            Arrays.sort(a);
        
        
        
        // -----------------------------***---------------------------------
        
        // Method 2 : 
        // By counting the number of occurence of 0,1,and 2
        // and then initialze the array a by the values
        
        
        // int count1 = 0 , count0 = 0 , count2 = 0;
        // for(int x : a){
        //     if(x == 0)
        //         count0++;
        //     else if(x == 1)
        //         count1++;
        //     else
        //         count2++;
        // }
        
        // for(int i=0 ; i < n ; i++){
        //     if(i < count0)
        //         a[i] = 0;
        //     else if(i < count0+count1)
        //         a[i] = 1;
        //     else
        //         a[i] = 2;
        // }
        
        // ----------------------------*****---------------------------
        
        // Method 3 : Editorial Method (Saw editorial after solve it by above 
        // two methods and then solve by this method to understand and add a new
        // method in the mind to solve this particular type of problem)
        
        // int low = 0 , mid = 0 , hi = n - 1 , temp;
        // while(mid <= hi){
        //     if(a[mid] == 0){
        //         temp = a[mid];
        //         a[mid] = a[low];
        //         a[low] = temp;
        //         low++;
        //         mid++;
        //         break;
        //     }else if(a[mid] == 2){
        //         temp = a[mid];
        //         a[mid] = a[hi];
        //         a[hi] = temp;
        //         hi--;
        //         mid++;
        //         break;
        //     }else{
        //         mid++;
        //     }
        // }
        
    }
}

// { Driver Code Starts.

class ThirdProgram {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends