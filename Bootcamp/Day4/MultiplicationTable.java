import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter a number upto where you want the table : ");
        num = sc.nextInt();

        for (int i = 1; i<= 10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
