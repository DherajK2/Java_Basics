import java.util.Scanner;

public class RotateOFNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int len =0;
        int temp = num;

        while (temp!=0) {
            temp = temp /10;
            len++;
        }

        k = k %len;
        if(k<0){
            k = k + len;
        }
        //k will rage form 0 to length of digit

        int divisor = (int)Math.pow(10, k);
        int multiplier = (int)Math.pow(10, len -k);
        
        int remainder = num% divisor;
        int quotient = num /divisor;

        int roatedNum = remainder * multiplier + quotient ;

        System.out.println(roatedNum);





        sc.close();
    }
}
