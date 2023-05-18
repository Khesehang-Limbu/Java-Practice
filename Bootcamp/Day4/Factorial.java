import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, factorial = 1;

        System.out.println("Enter a number : ");
        num = sc.nextInt();

        for (int i = num; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial is " + factorial);
    }
}
