/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stringimp;

/**
 *
 * @author khese
 */
import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
//        String num;
//        System.out.println("Enter a number: ");
//        Scanner sc = new Scanner(System.in);
//        num = sc.next();
//        int radix;
////    num2 = sc.nextInt();
//
//        if (num.matches("[01]+")) {
//            radix = 2;
//            System.out.println("Binary and radix is " + radix);
//        } else if (num.matches("[0-7]+")) {
//            radix = 8;
//            System.out.println("octal and radix is " + radix);
//        } else if (num.matches("[0-9]+")) {
//            radix = 10;
//            System.out.println("Decimal and radix is " + radix);
//        } else if (num.matches("[0-9A-F]+")) {
//            radix = 16;
//            System.out.println("Hexadecimal and radix is " + radix);
//        } else {
//            System.out.println("Invalid Number");
//   }

//        int year;
//        Boolean isLeap = true;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbver : ");
//        year = sc.nextInt();
//
//        if (year % 4 == 0) {
//            isLeap = true;
//            if (year%100 == 0){
//                isLeap = false;
//            }else if (year%400 == 0){
//                isLeap = true;
//            }
//        }else {
//            isLeap = false;
//        }
//        if (isLeap){
//            System.out.println("Leap Year");
//        }else{
//            System.out.println("Not a Leap Year");
//        }
//    String str = "http://www.google.com";
//    int i = str.indexOf(":");
//    String protocol = str.substring(0, i);
//    String type = str.substring(str.lastIndexOf(".")+1, str.length());
//        System.out.println(type);
//    if (protocol.equals("http")){
//        System.out.println("Hypertext Transfer Protocol");
//    }else if (protocol.equals("https")){
//        System.out.print);ln("Hypertext Transfer Protocol Secure");
//    }else if (protocol.equals("ftp")){
//        System.out.println("File Transfer Protocol");
//    }
//
//    String  websiteExt;
//    
//        System.out.println("Enter website url : ");
//        Scanner sc = new Scanner(System.in);
//        
//        websiteExt = sc.next();
//        String ext = websiteExt.substring(websiteExt.lastIndexOf(".")+1);
//        switch (ext){
//        case "com" -> System.out.println("Commercial");
//        case "org" -> System.out.println("Orhanization");
//        case "net" -> System.out.println("Network");
//    }
//        System.out.println("What do you want to do? \n1. ADD\n2. SUB\n3. Mul\n4. DIV\n");
//        String option;
//        int num1, num2;
//        Scanner sc = new Scanner(System.in);
//        option = sc.next().toUpperCase();
//        System.out.print("Enter two numbers :");
//        num1 = sc.nextInt();
//        num2 = sc.nextInt();
//
//        switch (option) {
//            case "ADD" -> System.out.println(num1 + num2);
//            case "SUB" -> System.out.println(num1 - num2);
//            case "MUL" -> System.out.println(num1 * num2);
//            case "DIV" ->  {
//                if (num2 != 0) {
//                    System.out.println(num1 + num2);
//                } else {
//                    System.out.println("Math Error");
//                }
//            }
//            default -> System.out.println("Invalid Input");
//        }
//    int rem = 0, quotitent = 0, sum = 0, temp = num;
//    int numOfDigits = 0;
//    String reverseNumber = "";
//    
//    while (temp != 0){
//        rem = temp % 10;
//        temp = temp/10;
//        numOfDigits+=1;
//        System.out.print(rem + " ");
//        sum = sum + (rem*rem*rem);
//        reverseNumber = reverseNumber.concat(String.valueOf(rem));
//    }
//        System.out.println(reverseNumber);
//        if (num == Integer.parseInt(reverseNumber)){
//            System.out.println("Palindrome Number");
//        }
//        System.out.println("Number of digits : " + numOfDigits);
//        System.out.println(sum);
//        if (sum == num){
//            System.out.println("Armstrong Number");
//        }
        int num, r, q;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
        String n = "";
        while (num>0){
            r = num%10;//123
            num = num/10;
            n += r;
        }
        System.out.println(n);
        
        for (int i = n.length()-1; i>=0; i--){
            char temp = n.charAt(i);
            
            switch(temp){
                case '1' -> System.out.println("one");
                case '2' -> System.out.println("two");
                case '3' -> System.out.println("three");
                case '4' -> System.out.println("four");
                case '5' -> System.out.println("five");
                case '6' -> System.out.println("six");
                case '7' -> System.out.println("seven");
                case '8' -> System.out.println("eight");
                case '9' -> System.out.println("nine"); 
            }
            
        }
    }
}
