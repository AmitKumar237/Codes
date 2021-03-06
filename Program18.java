// https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?fbclid=IwAR32SVbr0Rw118Zwilw_glNMP2tP3GbRcJ1TRmXB-qKqxb8IJTIPqS8-558#

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        
        if(arr.length == 1)
            return 1;
        
        long sumA = 0 , sum =0;
        
        for(int i=0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        
        for(int i=1 ; i < arr.length ; i++){
            sumA += arr[i-1];
            
            if(sumA == (sum - sumA - arr[i]))
                return i+1;
            
        }
        
        return -1;
    }
}
