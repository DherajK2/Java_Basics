import java.util.Scanner;

// Wap edge cases is your negative Number 
public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reverse = 0;
        int num = Math.abs(n);

        while (n != 0) {
            int r = n % 10;
            reverse = reverse * 10 + r;
            n /= 10;
        }

       // if (n < 0) reverse = -reverse;

        System.out.println(reverse);
        sc.close();
    }
}
