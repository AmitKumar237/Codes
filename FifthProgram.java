// https://www.codechef.com/problems/AMSGAME1
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        String ans = "";
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            Integer arr[] = new Integer[n];
            String str[] = br.readLine().trim().split(" ");
            for (int i=0; i < n; i++ ){
                arr[i] = Integer.parseInt(str[i]);
            }
            
            int result = arr[0];
            for(int i=1;i < n ;i++){
                result = gcd(arr[i] , result);
            }
            
            ans +=result + "\n";
        }
        System.out.println(ans);
    }
    
    
    public static int gcd(int a , int b){
        if(b == 0)
            return a;
        return gcd(b , a%b);
    }

    // public static int find(Integer [] arr){
    //     Arrays.sort(arr);
    //     if(arr[0] == arr[arr.length - 1])
    //         return arr[0];
            
    //     arr[arr.length - 1] -= arr[0];
    //     return find(arr);

    // }
}