package Shopping_Cart_Basic;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Price of Pen");
        double pen = sc.nextDouble();
         System.out.println("Enter the Price of Pencil");
        double pencil = sc.nextDouble();
         System.out.println("Enter the Price of Book");
        double book = sc.nextDouble();

        double totalCostWithoutGst= pen+pencil+book;

         System.out.println("Total Cost without Gst"+ totalCostWithoutGst);

         double GstAddedOnPrice= 0.18*totalCostWithoutGst;

         System.out.println("Gst Added for 18% "+ GstAddedOnPrice);

         double totalCostWithGstAdded = totalCostWithoutGst+ GstAddedOnPrice;

         System.out.println("Total Bill Amount :"+ totalCostWithGstAdded);
        sc.close();

    }
}
