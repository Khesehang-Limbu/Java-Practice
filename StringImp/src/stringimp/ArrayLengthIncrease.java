/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp;

/**
 *
 * @author khese
 */
public class ArrayLengthIncrease {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println("Array length of a is :" + a.length);
        
        int b[] = new int[a.length*2];
        
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        
        for (int x : b){
            System.out.print(x + ",");
        }
        
        a = b;
        b = null;
        
        System.out.println("\nArray length of a : " + a.length);
    }
    
}
