/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp;

/**
 *
 * @author khese
 */
public class Matrix {
    public static void main(String[] args) {
        int a[][] = {{4, 2, 1}, {5, 2, 4}, {7, 2, 0}};
        int b[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int c[][] = new int [a.length][b.length];
        
        String str [] = {"python", "ada", "java", "ruby"};
        
//        for (int i = 0; i <a.length; i++){
//            for(int j = 0; j<a[i].length; j++){
//                c[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        
//        for (int i = 0; i <a.length; i++){
//            for(int j = 0; j<a[i].length; j++){
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println("");
//        }

//        for (int x[] : c){
//            for(int y : x){
//                System.out.print(y + " ");
//            }
//            System.out.println("");
//        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j<b.length; j++){
                for(int k = 0; k < c.length; k++){
                    c[i][j] += a[i][k]*b[j][k];
                }
            }
        }
        
        for(int x[] : c){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
        
        java.util.Arrays.sort(str);
        
        for (String x : str){
            System.out.print(x + ",");
        }
    }
    
}
