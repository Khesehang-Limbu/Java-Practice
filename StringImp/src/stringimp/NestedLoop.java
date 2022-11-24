/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp;

/**
 *
 * @author khese
 */
public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if (i+j>5){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <= 5; k++){
                if (k<i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            
            System.out.println("");
        }
    }
    
}
