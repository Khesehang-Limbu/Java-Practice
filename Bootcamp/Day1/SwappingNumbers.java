public class SwappingNumbers {
    public static void main(String[] args) {
        //Swapping two values without using a third variable
        int a = 10, b = 20;
        System.out.println(String.format("%s", Integer.toBinaryString(a)));
        a = a ^ b;
        System.out.println(String.format("%s", Integer.toBinaryString(a)));
        System.out.println(String.format("%s", Integer.toBinaryString(b)));

        b = a ^ b;
        System.out.println(String.format("%s", Integer.toBinaryString(a)));
        System.out.println(String.format("%s", Integer.toBinaryString(b)));

        a = a ^ b;
        System.out.println(String.format("%s", Integer.toBinaryString(a)));
        System.out.println(String.format("%s", Integer.toBinaryString(b)));

        System.out.println("a : " + a + " b : " + b);

        //Storing two intergers in one variable
        byte c = 9;
        byte d = 12;
        byte e;
        
        e = (byte)(c<<4);
        e = (byte)(e | d);
        System.out.println((e & 0b11110000) >> 4);
        System.out.println(e & 0b00001111);
    }
}
