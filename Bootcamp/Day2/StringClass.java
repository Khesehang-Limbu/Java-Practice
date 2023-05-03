import java.lang.*;

public class StringClass{
    public static void main(String[] args) {
        // byte c[] = {65, 66, 67, 68};
        // String str1 = new String("Hello World!");
        // String str2 = new String(c);

        // String a = "ww.google.com";
        // String b = "Java";
        // b = b.replace('a', 'k');
        // System.out.println(a.startsWith("www"));
        // System.out.println(b);

        // System.out.println(str1 + " " + str2);

        // System.out.println("Khesehang yonghang".matches("[A-Z]\\w+\\s\\w+"));
        String str = "programmer@gmail.com";

        Boolean coorrectMail = str.matches("[a-zA-Z]+@[a-z]+.\\w+");
        
        String username = str.substring(0, str.indexOf('@'));
        String domain = str.substring(str.indexOf('@'), str.length());
        domain = domain.substring(1, domain.indexOf('.'));
       
        
        if (coorrectMail && domain.equals("gmail")){
            System.out.println("Username is " + username);
            System.out.println("Domain Name is " + domain);
        }
    }
}