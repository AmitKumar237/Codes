// https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0?fbclid=IwAR0_5X55DEpCVnwRpk98IUYO_Gi9bDspwQnUYv_oUFvMf-_qfr0XSxW34hE#

package com.amit;

import java.util.*;
import java.lang.*;

class FirstProgram {
    public static void main (String[] args) {
        // Making an object of Scanner class to take the input
        Scanner sc = new Scanner(System.in);
        // Taking the number of cases and declaring two separate array of size number of test cases user
        // wanted to check
        int test = sc.nextInt();
        int [] N = new int[test];
        int [] D = new int[test];
        // Declaring an array of array to store the elements provided in every cases ,
        // Arraylist is used just because at the compile time we dont have the knowledge of how many elements
        // array is going to hold
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        // Loop to take all inputs and initialize the array and arraylist
        for(int i=0 ; i < test ; i++){
            N[i] = sc.nextInt();
            D[i] = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j < N[i] ; j++){
                temp.add(sc.nextInt());
            }
            list.add(temp);
        }

        // Modify the arraylist as instructed
        for (int i = 0; i < test; i++) {
            for (int j = 0; j < D[i]; j++) {
                list.get(i).add(list.get(i).size() , list.get(i).get(0));
                list.get(i).remove(0);
            }
        }

        // Printing the modified rotated ArrayList
        for (int i = 0; i < test; i++) {
            for (int x: list.get(i)) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}