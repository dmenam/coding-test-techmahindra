/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.techmahindra;

import java.util.Arrays;

/**
 *
 * @author dmenam
 */
public class Test {
    
    
    
    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int last = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > last && A[i]<A[i]++) {
                System.out.println("Found it: " + A[i]);
            } else {
                last = A[i];
                System.out.println(A[i]);
            }
        }
        
        System.out.println(Arrays.toString(A));
        
        return 0;
    }
}
