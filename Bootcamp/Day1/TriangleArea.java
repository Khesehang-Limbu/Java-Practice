import java.lang.*;
import java.util.Scanner;
import java.math.*;

public class TriangleArea{
    public static void main(String[] args){
        float base, height, area;

        float a, b, c, s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of the triangle : ");
        base = sc.nextFloat();
        System.out.println("Enter the base of the triangle : ");
        height = sc.nextFloat();

        System.out.println("The area of the triangle is " + 0.5*base*height);

        System.out.println("Enter the three sides of the triangle : ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        s = 0.5f*(a+b+c);
        area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("The are of the scalar triangle is " + area);
        sc.close();
    }
}