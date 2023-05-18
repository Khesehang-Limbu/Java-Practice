import java.sql.SQLOutput;
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        int num, a, d;
        String ap = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number upto where you want a AP : ");
        num = sc.nextInt();
        System.out.println("Enter a and d : ");
        a = sc.nextInt();
        d = sc.nextInt();

        for (int i = 0; i < num; i++){
            ap = ap + (a) + ", ";
            a = a + d;
        }
        System.out.println(ap);
    }
}
