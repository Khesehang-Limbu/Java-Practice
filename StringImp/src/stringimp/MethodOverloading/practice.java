import java.lang.*;
public class practice{

public static void main(String[] args) {
        int sum = 0;
        
        for(String s: args){
            if(s.matches("[0-9\\.]+")){
                sum += Integer.parseInt(s);
            }
        }
        System.out.println(sum);
    }
}