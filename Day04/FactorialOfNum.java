import java.util.*;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be found: ");
        int num = sc.nextInt();

        int fact = 1;

        if (num == 0) {
            System.out.println("The factorial of 0 is: 1");
        } else if (num < 0) {
            System.out.println("Enter a valid number");
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("The factorial of " + num + " is: " + fact);
        }

        sc.close();
    }
}
