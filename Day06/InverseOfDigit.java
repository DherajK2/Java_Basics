import java.util.Scanner;

public class InverseOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int inverse = 0;
        int position = 1;

        while (n > 0) {
            int digit = n % 10;

            inverse += position * (int)Math.pow(10, digit - 1);

            n = n / 10;
            position++;
        }

        System.out.println(inverse);
        sc.close();
    }
}
