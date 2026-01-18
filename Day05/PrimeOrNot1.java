
// Not good Approach because we are checking uptill the num is itself factors
import java.util.Scanner;

public class PrimeOrNot1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        int factorCount =0;

        for(int i=1;i<=num;i++){
            if(num%i ==0){
               
                factorCount++;
            }
        }
        if(factorCount == 2){
            System.out.println( num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }
}
