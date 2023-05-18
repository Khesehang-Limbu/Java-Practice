import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, a = 0, b = 1, newTerm = 0;
        String fiboSeries = "0, 1, ";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter upto where you want : ");
        n = sc.nextInt();

        for (int i = 0; i < n-2; i++){
            newTerm = a + b;
            fiboSeries = fiboSeries + newTerm + ", ";
            a = b;
            b = newTerm;
        }
        System.out.println(fiboSeries);
    }
}
