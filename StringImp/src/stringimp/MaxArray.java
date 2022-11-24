/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp;

import java.util.Scanner;

/**
 *
 * @author khese
 */
public class MaxArray {
    static int maxInArray(int A[]){
        int max = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int A [] = new int [10];
        int max = 0;
        System.out.println("Enter ten elements of an array : ");
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        
        System.out.println("The elements of the array are : ");
        for(int x : A){
            System.out.print(x + ",");
        }
        System.out.println("");
        max = maxInArray(A);
        System.out.println("The maximum element in the given array is : " + max);
    }
    
}
