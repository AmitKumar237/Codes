// https://www.hackerearth.com/practice/math/number-theory/primality-tests/practice-problems/algorithm/monks-problem-ffeebf8a/

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String out_ = solve(N);
            wr.println(out_);
        }

        wr.close();
        br.close();
    }

    static String solve(int N) {
        // Just apply the prime number concept
        for(int i = 2 ; i <= Math.sqrt(N) ;i++){
            if(N%i == 0)
                return "Yes";
        }
        
        return "No";

    }
}