import java.util.*;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read year from user
        System.out.print("Enter a year to check for leap Year: ");
        int year = sc.nextInt();

        // Leap year condition
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("Not a leap year");
        }

        sc.close();
    }
}
