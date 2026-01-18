import java.util.Scanner;

public class PrintPrimeFrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for (int x = 2; x * x <= i; x++) {
                if (i % x == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
