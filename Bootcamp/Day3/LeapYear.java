import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        boolean isLeap;

        System.out.println("Enter a year : ");
        year = sc.nextInt();

        if (year%4 == 0){
            if (year%100 == 0){
                if (year%400 == 0){
                    isLeap = true;
                }else {
                    isLeap = false;
                }
            }else{
                isLeap = true;
            }
        }else{
            isLeap = false;
        }

        if (isLeap){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
