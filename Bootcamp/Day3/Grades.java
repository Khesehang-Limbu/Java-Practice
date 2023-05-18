import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        int m1, m2, m3, total;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of three subjects : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        total = m1+m2+m3;
        average = (float)total/3;

        if (average >= 70){
            System.out.println("You got an A.");
        }else if (average < 70 && average > 60){
            System.out.println("You got a B+");
        }else if (average < 60){
            System.out.println("You got a B");
        }

    }
}
