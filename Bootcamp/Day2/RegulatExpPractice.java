public class RegulatExpPractice {
    public static void main(String[] args) {
        //Regular Expression to check if the num is binary
        int binaryNum = 10110;
        String binaString = String.valueOf(binaryNum);
        Boolean isBinary = binaString.matches("[0-1]+");
        System.out.println(isBinary);

        //Regular Expression to check if a number is a hexadecimal or not 
        int hexaNum = 0xAC1B45;
        String hexDecimalNum = String.valueOf(hexaNum);
        Boolean isHexa = hexDecimalNum.matches("[0-9A-F]+");
        System.out.println(isHexa);

        // Regular Expression to check dates
        String date = "01/11/2023";
        Boolean isDateCorrect = date.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        System.out.println(isDateCorrect);

        // Remove Special Characters from a String
        String wordWithSpecialCharacters = "A!b@c#1$2%3%";
        String wordWithNoSpecialCharacters = wordWithSpecialCharacters.replaceAll("[^\\w]", "");
        System.out.println(wordWithNoSpecialCharacters);

        //Remove extra spaces from string
        String wordWithSpaces = "   abc   de   fgh   ijk   ";
        String wordWithSingleSpace = wordWithSpaces.replaceAll("\\s+", " ");
        System.out.println(wordWithSingleSpace.split("\\s").length);
        System.out.println(wordWithSingleSpace.trim());

        // Find number of words in a String
        String wordWithNum = "khesehang123456Yonghang";
        String wordWIthNoNum = wordWithNum.replaceAll("\\d+", "");
        System.out.println(wordWIthNoNum);
        System.out.println("Number of letters : " + wordWIthNoNum.length());
    }
}
