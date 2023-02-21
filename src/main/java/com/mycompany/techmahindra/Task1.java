/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.techmahindra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author dmenam
 */
public class Task1 {

    private List<Integer> digitsSum;
    private int n1, n2;

    public int solution(int[] A) {
        // Implement your solution here
        
        //Sort array
        Arrays.sort(A);

        //System.out.println(Arrays.toString(A));

        digitsSum = new ArrayList<>();
        
        //Iterate array and add the sum of ciphers
        for (int i = 0; i < A.length; i++) {
            digitsSum.add(digitSum(A[i]));
        }

        //System.out.println(digitsSum.toString());

        //Iterate array to find a pair
        // Initialize index of first repeating element
        int min = -1;
  
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array from right to left
        for (int i = digitsSum.size() - 1; i >= 0; i--) {

            //System.out.println(digitsSum.get(i));

            // If element is already in hash set, update min
            if (set.contains(digitsSum.get(i))) {
                min = i;
                break;
            }
  
            else // Else add element to hash set
                set.add(digitsSum.get(i));
        }
  
        // Print the result
        if (min != -1){
            
            //Get the repeated numbers
            for(int i = digitsSum.size() - 1; i >= 0; i--){
                if (digitsSum.get(i) == digitsSum.get(min)) {
                    n1 = A[i];
                    n2 = A[min];
                    break;
                }
            }
            System.out.printf("The numbers are %s & %s as a result %s", n1, n2, (n1+n2));
            return n1+n2;
        } else {
            System.out.println("There are no repeating elements");
            return min;
        }
    }
    
    private int digitSum(int x){
        
        int digit, sum;
        
        sum = 0;
        
        while (x != 0) {           //mientras a n le queden cifras
            digit = x % 10;        //obtenemos la ultima cifra del número
            sum = sum + digit;     //sumamos la última cifra de n
            x = x / 10;            //le quitamos a n la última cifra 
        }
        
        return sum;
    }
}
