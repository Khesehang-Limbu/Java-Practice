import java.util.Scanner;

public class RadixChecker {
    public static void main(String[] args) {
        String num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        num = sc.next();


        if (num.matches("[0-1]+")){
            System.out.println("Binary Number\nRadix is 2");
        }else if (num.matches("[0-9]+")){
            System.out.println("Decimal Number\nRadix is 10");
        }else if (num.matches("[0-7]+")){
            System.out.println("Octal NUmber\nRadix is 8");
        }else if (num.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal Number\nRadix is 16");
        }
    }
}
