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
public class HCF {
    static int findHCF(int num, int num1){
        int biggerNum = num1;
        if (num > num1){
            biggerNum = num;
        }
        
        for(int i = 2; i<=biggerNum/2; i++){
            if (num > num1){
                num = num - num1;
            } else if(num < num1){
                num1 = num1-num;
            } else if(num == num1){
                return num;
            }
        }
        return 0;
        
    }
    public static void main(String[] args) {
        int num1, num2, hcf;
        
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        hcf = findHCF(num1, num2);
        
        if (hcf == 0){
            System.out.println("There is not highest common factor.");
        }else{
            System.out.println("The highest common factor of " + num1 + " and " + num2 + " is " + hcf);
        }
        
    }
}
