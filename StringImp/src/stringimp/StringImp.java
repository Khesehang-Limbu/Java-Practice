/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringimp;

/**
 *
 * @author khese
 */
public class StringImp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String name = "Advanced College of Engineering and Management";
//        System.out.println(name.replace("a", "A"));
//        System.out.println(name.replaceFirst("a", "A"));
//        System.out.println(name.replaceAll("Advanced.*", "Hello"));
//        System.out.println(name.indexOf("a"));
//        System.out.println(name.lastIndexOf("a"));
//        System.out.println(name.contains("ol"));
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        String A = "A";
//        String a = "a";
// 
//        System.out.println(A.compareTo(a));
//        System.out.println("*******************");
//        String str1 ="Padma";
//        str1.concat("Shree");
//        System.out.println(str1);
//        
//        StringBuffer strb = new StringBuffer("Padma");
//        strb.append("Shree");
//        System.out.println(strb);

        StringBuffer strb = new StringBuffer("Java Programming i");
        System.out.println(" Programming");
        System.out.println(strb.length());
        System.out.println(strb.capacity());
        System.out.println(strb.charAt(5));
        System.out.println(strb.deleteCharAt(7));
        System.out.println(strb.delete(5, 9));
        System.out.println(strb.reverse());
        System.out.println(strb.insert(5, "Kupondole"));
        StringBuffer sb = new StringBuffer("Java");
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        
    }
}
