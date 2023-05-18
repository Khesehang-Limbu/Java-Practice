import java.util.Scanner;

public class DayANumInWords {
    public static void main(String[] args) {
        int num, r, d, rev = 0;
        char c;
        String words = "", newNum = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        num = sc.nextInt();

        while (num != 0){
            r = num % 10;
            rev = rev*10 + r;
            num = num/10;
            newNum += r;
        }

        while (!newNum.equals("")){
            System.out.println(newNum);
            c = newNum.charAt(newNum.length()- 1);
            newNum = newNum.substring(0, newNum.length()-1);

            switch (c){
                case '0':
                    words = words + "Zero ";
                    break;
                case '1':
                    words = words + "One ";
                    break;
                case '2':
                    words = words + "Two ";
                    break;
                case '3':
                    words = words + "Three ";
                    break;
                case '4':
                    words = words + "Four ";
                    break;
                case '5':
                    words = words + "Five ";
                    break;
                case '6':
                    words = words + "Six ";
                    break;
                case '7':
                    words = words + "Seven ";
                    break;
                case '8':
                    words = words + "Eight ";
                    break;
                case '9':
                    words = words + "Nine ";
                    break;
            }
        }

        System.out.println(words);
    }
}
