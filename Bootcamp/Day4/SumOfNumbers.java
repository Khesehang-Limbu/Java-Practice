import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter n : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }

}
