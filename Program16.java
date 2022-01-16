// https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/rest-in-peace-21-1/?fbclid=IwAR0NftPh70Mt3Om0toDgRsINkacZPCzxGPNsO93mN_xEO637CpNEmuRfYnU

import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0){
            int n = sc.nextInt();
            if(n % 21 == 0){
                System.out.println("The streak is broken!");
                continue;
            }

            String s = n + "";

            while(!s.isEmpty()){
                if(s.startsWith("21")){
                    System.out.println("The streak is broken!");
                    break;
                }
                s = s.substring(1);
            }

            if(s.isEmpty())
                System.out.println("The streak lives still in our heart!");

        }                 
        
    }
}
