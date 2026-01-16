import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check for leap Year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("It is a leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("Not a leap year");
        }

        sc.close();
    }
}
