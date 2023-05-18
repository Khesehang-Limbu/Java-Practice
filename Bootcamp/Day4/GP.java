import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        int n, a, r;
        String gp = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Emter a, r, and n : ");
        a = sc.nextInt();
        r = sc.nextInt();
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            gp = gp + a + ", ";
            a = a*r;
        }
        System.out.println(gp);

    }
}
