import java.lang.*;
import java.util.Scanner;
import java.math.*;

public class RootsOfQuadraticEqn {
    public static void main(String[] args){
        int a, b, c;
        double r1, r2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficient of x^2 : ");
        a = sc.nextInt();

        System.out.println("Enter the coefficient of x : ");
        b = sc.nextInt();

        System.out.println("Enter the constant : ");
        c = sc.nextInt();
        
        r1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
        r2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;

        System.out.println("The roots of the quadratic equation in the form ax^2 + bx + c is " + r1 + " and " + r2);
        sc.close();
    }
}
