/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp.MethodOverloading;

/**
 *
 * @author khese
 */
public class ValidatationOverloaded {
    static boolean validate(String name){
        boolean query = name.matches("[A-Za-z\\s]+");
        return query;
    }
    
    static boolean validate(int age){
        if (age >= 3 && age <= 15){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int age = 25;
        String name = "Khesehang Yonghang";
        
        if (validate(age)){
            System.out.println("The person is eligible for the admission");
        }
        if (validate(name)){
            System.out.println("The name is correct");
        }else{
            System.out.println("The name is incorrect.");
        }
    }
    
}
