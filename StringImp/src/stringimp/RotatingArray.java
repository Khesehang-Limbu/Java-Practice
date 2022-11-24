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
public class RotatingArray {
    public static void main(String[] args) {
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        //         0  1  2  3  04  05 06  7  08 09
        int shift = 1;
        int n = 10, index = 3;
       
        
        for (int i = index; i < n-1; i++){
            a[i]= a[i+1];    
        }
//        a[index] = 1;
        
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + ",");
        }
    }
    
}
