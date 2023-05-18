import java.util.Locale;
import java.util.Scanner;

public class MenuDrivenArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option;
        int num1, num2;
        System.out.println("Menu\nADD\nSUB\nMUL\nDIV");
        System.out.print("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.print("Enter the option in words : ");
        option = sc.next().toLowerCase();

        switch (option){
            case "add":
                System.out.println("Sum is : " + (num1+num2));
                break;
            case "sub":
                System.out.println("Difference is : " + (num1-num2));
                break;
            case "mul":
                System.out.println("Product is : " + (num1*num2));
                break;
            case "div":
                System.out.println("Division is : " + (num1/num2));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

    }
}
