/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp.MethodOverloading;

/**
 *
 * @author khese
 */
public class CommandLineArguments {
    public static void main(String[] args) {
        int sum = 0;
        
        for(String s: args){
            if (s.matches("[0-9\\.]+"))
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
    
}
