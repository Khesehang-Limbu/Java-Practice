import java.lang.*;
import java.util.Scanner;

public class CuboidArea {
    public static void main(String[] args) {
        int length, breadth, height;
        int totalArea, volume;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, breadth, and height of the cuboid (m): ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        totalArea = 2 * (length * breadth) + 2 * (breadth * height) + 2 * (length * height);
        volume = length * breadth * height;
        
        System.out.println("The total area of the cuboid is " + totalArea + "m^2 and the total volume of the cuboid is " + volume + "m^3");
        sc.close();
    }
}
