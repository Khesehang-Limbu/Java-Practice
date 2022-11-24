/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp.MethodOverloading;

import java.util.Scanner;

/**
 *
 * @author khese
 */
public class AreaOverloaded {
    static float area(float l, float b){
        float area = l * b;
        return area;
    }
    
    static float area(float r){
        float area = (float)Math.PI*r*r;
        return area;
    }
    
    static float area(float a, float b, float h){
        float area = ((a+b)/2)*h;
        return area;
    }
    
    
    public static void main(String[] args) {
        int userDecision;
        float num1, num2, r, base, height, a, b;
        
        System.out.println("What do you want to find the area of? \n1.Rectangle\n2.Circle\n3.Parallelogram\n4.Trapezium");
        Scanner sc = new Scanner(System.in);
        userDecision = sc.nextInt();
        
        switch(userDecision){
            case 1:{
                System.out.println("Enter two numbers : ");
                num1 = sc.nextFloat();
                num2 = sc.nextFloat();
                
                System.out.println("The area of rectangle is :" + area(num1, num2));
                break;
            }
            case 2 : {
                System.out.println("Enter the radius of circle : ");
                r = sc.nextFloat();
                
                System.out.println("The area of circle is : " + area(r));
                break;
            }
            case 3 : {
                System.out.println("Enter the base and height of parellogram : ");
                base = sc.nextFloat();
                height = sc.nextFloat();
                
                System.out.println("The area of parallelogram is : " + area(base, height));
                break;
            }
            case 4 : {
                System.out.println("Enter the two parallel lines and height of trapezium : ");
                a = sc.nextFloat();
                b = sc.nextFloat();
                height = sc.nextFloat();
                
                System.out.println("The area of trapezium is : " + area(a,b, height));
                break;
            }
            default:
                System.out.println("Invalid Input");
                break;
        }
        
    }
    
}
