/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp.MethodOverloading;

/**
 *
 * @author khese
 */
public class Recursion {
    void fun(int n){
        if(n>0){
            System.out.println(n);
            fun(n-1);
        }
    }
    
    void fun(float n){
        if(n>0){
            fun(n-1);
            System.out.println(n);
        }
    }
    
    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.fun(3);
        r.fun(3.0f);
    }
    
}
