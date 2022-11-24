/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp.MethodOverloading;

/**
 *
 * @author khese
 */
public class ReverseNumberOverloaded {
    static int reverse(int num){
        int rem, reversedNum = 0;
        while(num>0){
            rem = num%10;
            reversedNum = rem*10;
            num = num/10;
        }
        return reversedNum;
    }
    
    static void reverse(int num[]){
        int temp [] = new int [num.length];
        
        for (int i = 0; i < temp.length; i++){
            temp[i] = num[temp.length-1-i]; 
        }
        
        for(int x: temp){
            System.out.print(x + ",");
        }
    }
    public static void main(String[] args) {
        int num = 123;
        int num1[] = {1, 2, 3, 4, 5, 6};
        System.out.println("The reversed number is : " + reverse(num));
        reverse(num1);
    }
    
}
