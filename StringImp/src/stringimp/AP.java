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
public class AP {

    public static void main(String[] args) {
        int a, b, num, n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, d, and limit : ");

        a = sc.nextInt();
        b = sc.nextInt();
        num = sc.nextInt();
        
        n=a;
        System.out.print(a+","+b);
        for (int i = 0; i < num; i++) {
           
            n = a + b;
            a = b;
            b = n;
            System.out.print(","+n);
        }
        
    }

}
