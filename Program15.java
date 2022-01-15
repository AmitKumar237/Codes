// https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1/?fbclid=IwAR0hOCGHvwvGbfrsp9YK0tHsVPFDmZyadsZMj4QZw-pvXJ7grCYdZYZ8uAQ

// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[] =  new int[l];
            
            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();
            
            Solution ob = new Solution();
                
            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);
                
            else
                System.out.println(-1);    
                
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        int i = 0;
        Arrays.sort(arr);
        while(i < size){
            if(binarySearch(arr , Math.abs(n - arr[i]) , 0 , size - 1))
                return true;
            i++;
        }
        return false;
    }
    
    public boolean binarySearch(int arr[] , int n , int s , int e){
        
        while(s <= e){
            
            int mid = s + (e - s) / 2;
            
            if(arr[mid] == n)
                return true;
                
            if(arr[mid] > n)
                e = mid - 1;
            else
                s = mid + 1;
        }
        return false;
        
    }
}