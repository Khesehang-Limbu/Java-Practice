import java.util.Scanner;
public class CheckYong {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = sc.nextInt();

        if (age >= 14 && age <= 55){
            System.out.println("You are young");
        }else{
            System.out.println("You are old.");
        }
    }
}
