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
public class Task2 {
    public int solution(int N, int[] A, int[] B) {
        
        // Initialize a DP array to save the Degree of Each Vertex of Graph
        int[] dp = new int[N + 1];
        int sum = 0;
        
        // Iterate over A and B and increase the index value in DP array
        for (int i = 0; i < A.length; i++) {
            dp[A[i]]++;
            dp[B[i]]++;
        }
        
        // Sort the array so that we can assign max value of N to Vertex with maximum
        // //degree
        Arrays.sort(dp);
        for (int j = dp.length - 1; j > 0; j--) {
            sum += dp[j] * j;
        }

        System.out.println(sum);
        return sum;
    }
}
