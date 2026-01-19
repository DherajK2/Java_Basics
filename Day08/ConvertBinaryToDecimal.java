import java.util.Scanner;

public class ConvertBinaryToDecimal {

    // This method converts a binary number (given as an int) to decimal
    public static int BinaryToDecimal(int x) {
        int i = 0;        // power of 2 (position of the bit)
        int mul = 0;      // stores the final decimal result

        // Loop runs until all binary digits are processed
        while (x != 0) {
            int r = x % 10;   // get the last digit (0 or 1)

            // multiply the digit with 2^i and add to result
            mul = mul + r * (int) Math.pow(2, i);

            x = x / 10;  // remove the last digit
            i++;         // move to the next power of 2
        }
        return mul;  // return decimal value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read binary number from user
        int num = sc.nextInt();

        // Convert binary to decimal
        int DecimalNum = BinaryToDecimal(num);

        // Print the decimal value
        System.out.println(DecimalNum);
    }
}
