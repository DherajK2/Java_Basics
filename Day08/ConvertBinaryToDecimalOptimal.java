import java.util.Scanner;

public class ConvertBinaryToDecimalOptimal{

    // Method to convert binary (as a String) to decimal
    public static int BinaryToDecimal(String binary) {
        int decimal = 0;             // stores the decimal result
        int length = binary.length(); // length of the binary string

        // Loop through each character from left to right
        for (int i = 0; i < length; i++) {
            char bitChar = binary.charAt(length - 1 - i); // get bit from right to left
            if (bitChar == '1') {
                decimal += Math.pow(2, i);  // add 2^i if the bit is 1
            } else if (bitChar != '0') {
                // Invalid character detected
                System.out.println("Invalid binary number!");
                return -1;
            }
        }

        return decimal; // return the decimal value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read binary number as a String to preserve leading zeros
        System.out.print("Enter a binary number: ");
        String binaryNum = sc.next();

        // Convert binary to decimal
        int decimalNum = BinaryToDecimal(binaryNum);

        if (decimalNum != -1) { // check for invalid input
            System.out.println("Decimal value: " + decimalNum);
        }
    }
}
