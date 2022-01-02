// https://practice.geeksforgeeks.org/problems/a-guy-with-a-mental-problem1604/1?fbclid=IwAR2LRimLO4T7xMTS5dp1bnAEfo3kMYUaJjbeTucEMKxnpD8ONvTJDNwjNSQ#
package com.amit;

import java.lang.*;
import java.io.*;

class SecondProgram {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];


            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }


            Solution obj = new Solution();
            System.out.println(obj.minTime(a, b, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {

    public long minTime(long a[], long b[], long n) {
        // declare 2 variable to store the sum of both the ways which he can take to reach the home
        long sum1  = 0 , sum2 = 0;
        // Loop to traverse over all the elements of the array and add them to the variables sum1 and sum2
        for(int i=0 ; i < n ; i++){
            if(i%2 == 0){
                sum1 += a[i];
                sum2 += b[i];
            }else{
                sum1 += b[i];
                sum2 += a[i];
            }
        }

        // return sum1 if it is small than sum2
        if(sum1 < sum2)
            return sum1;

        // If the program execution comes to this line it means the sum1 is greater or equal to sum2
        // so return sum2
        return sum2;
    }
}
