import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result[][] = new int[t][2];
        for(int i=0 ; i < t ; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[m];
            int j = 0;
            while(j < n){
                int temp = sc.nextInt() % m;
                arr[temp]++;
                j++;
            }
            j=0;
            while(j < m){
                if(arr[j] == 1)
                    result[i][1]++;
                if(arr[j] > 0)
                    result[i][0]++;
                j++;
            }
        }
        for(int i=0 ; i < t ; i++){
            System.out.println(result[i][0]);
            System.out.println(result[i][1]);
        }
    }
}