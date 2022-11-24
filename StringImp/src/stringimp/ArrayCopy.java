/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp;

/**
 *
 * @author khese
 */
public class ArrayCopy {
    public static void main(String[] args) {
        int c[] = new int[10];
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for (int i =0; i <a.length; i++){
//            c[i] = a[i];
            c[a.length-1-i] = a[i];
        }
        
        for (int x : c){
            System.out.print(x + ",");
        }
        
        
    }
    
}
