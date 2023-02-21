/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.techmahindra;

/**
 *
 * @author dmenam
 */
public class TechMahindra {

    public static void main(String[] args) {
        Test t = new Test();
        //t.solution(new int[]{1, 3, 6, 4, 1, 2});
        
        //Task 1
        Task1 t1 = new Task1();
        //t1.solution(new int[]{51,33,42,15}); //All ciphers have the same sum
        //t1.solution(new int[]{51,71,23,90}); //No repeating elemets
        //t1.solution(new int[]{51,71,17,42}); //Two pairs (Take the bigest sum)
        
        //Task 2
        Task2 t2 = new Task2();
        //t2.solution(5, new int[]{2,2,1,2}, new int[]{1,3,4,4});
        //t2.solution(3, new int[]{1}, new int[]{3});
        t2.solution(4, new int[]{1,3}, new int[]{2,4});

        //Task 3
        Task3 t3 = new Task3();
        //t3.solution("minusplusminus");
    }
}
