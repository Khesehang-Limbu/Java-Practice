/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp.MethodOverloading;

/**
 *
 * @author khese
 */
public class VariableArguments {
    static int max(int ...A){
        int max = A[0];
        if (A.length == 0){
            return Integer.MIN_VALUE;
        }else{
            
            for (int i = 0; i<A.length; i++){
                if (max < A[i]){
                    max = A[i];
                }
            }
        }
        return max;
    }
    
    static int sum(double ...n){
        int sum = 0;
        for(int i =0; i < n.length; i++){
            sum += n[i];
        }
        return sum;
    }
    
    static double discount(double ...d){
        double sum = sum(d);
        double discount;
        if (sum > 500){
            discount = 0.1 * sum;
        }else if(sum > 500 && sum < 1000){
            discount = 0.2*sum;
        }else {
            discount = 0.25*sum;
        }
        return discount;
    }
    public static void main(String[] args) {
        System.out.println("The maximum of numbers is : " + max(5, 10, 25, 1, 2, 3, 100, 25, 90));
        System.out.println("The sum of numbers is : " + sum(5, 10, 25, 1, 2, 3, 100, 25, 90));
        System.out.println("The maximum of numbers is : " + max(5, 10, 25, 1, 2, 3, 25, 90));
        System.out.println("The maximum of numbers is : " + discount(5, 1000, 25, 1, 2, 3, 25, 90));
    }
}
