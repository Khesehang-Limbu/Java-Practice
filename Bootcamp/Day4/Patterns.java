public class Patterns {
    public static void main(String[] args) {
        int count = 1;
        int n = 5;
        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j<=n; j++){
//            for(int j = 1; j<=5-i+1; j++){
//                System.out.format("%02d " , j);
//                count++;
            for (int j = 1; j <= 5; j++) {
//                if (j>=i){
//                    System.out.format("%s ", "*");
//                }else{
//                    System.out.print("  ");
//                }
                if (j > 5 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 2; k <= 5; k++) {
                if (k <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j<=n; j++){
//            for(int j = 1; j<=5-i+1; j++){
//                System.out.format("%02d " , j);
//                count++;
            for (int j = 1; j <= 5; j++) {
//                if (j>=i){
//                    System.out.format("%s ", "*");
//                }else{
//                    System.out.print("  ");
//                }
                if (j <= i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }

            for (int k = 2; k <= 5; k++) {
                if (k <= 5-i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        n--;
    }
}
