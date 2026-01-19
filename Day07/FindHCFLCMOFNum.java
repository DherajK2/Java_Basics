import java.util.Scanner;

public class FindHCFLCMOFNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        // Euclidean Algorithm
        while (num2 != 0) {
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }

        int hcf = num1;
        System.out.println("HCF: " + hcf);

        //a*b = lcm * hcf 
        int lcm = (int)((a*b) / hcf);
        System.out.println("LCM: " + lcm);

        sc.close();
    }
}
