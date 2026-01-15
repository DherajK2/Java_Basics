import java.util.*;  // Import Scanner for user input

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Create Scanner object

        // Take input for item prices
        System.out.println("Enter the Price of Pen: ");
        double pen = sc.nextDouble();

        System.out.println("Enter the Price of Pencil: ");
        double pencil = sc.nextDouble();

        System.out.println("Enter the Price of Book: ");
        double book = sc.nextDouble();

        // Calculate total cost without GST
        double totalCostWithoutGst = pen + pencil + book;
        System.out.println("Total Cost without GST: " + totalCostWithoutGst);

        // Calculate GST (18%) and total cost with GST
        double gst = 0.18 * totalCostWithoutGst;
        System.out.println("GST Added for 18%: " + gst);

        double totalCostWithGst = totalCostWithoutGst + gst;
        System.out.println("Total Bill Amount: " + totalCostWithGst);

        sc.close();  // Close Scanner very important
    }
}
