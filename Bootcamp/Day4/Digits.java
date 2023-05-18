import java.util.ArrayList;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        int num, count = 0, sumOfCubesOfDigits = 0, r, temp, rev = 0;
//        ArrayList<String> digit = new ArrayList<>();
//        StringBuilder digit= new StringBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        num = sc.nextInt();
        temp = num;
        while (num != 0){
//            digit.add(0,  String.valueOf(num % 10));
            r = num % 10;
//            digit.append(r);
            sumOfCubesOfDigits += (r * r * r);
            num = num/10;
            count++;
            rev = rev*10 + r;
        }

        if (sumOfCubesOfDigits == temp){
            System.out.println("Armstrong number");
        }

        if (temp == rev){
            System.out.println("Palidrome Number");
        }
    }
}
