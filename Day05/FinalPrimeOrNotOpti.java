// Num factors repaeat just after the square root of that num will loop that num upto that square root if we are getting only two factors 
// then prime other wise not we will also add the case 2 code and optimise it

import java.util.Scanner;

public class FinalPrimeOrNotOpti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        
        boolean isPrime = true;
        for(int i = 2; i<Math.sqrt(num);i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true && num!= 1){
            System.out.println("Prime number");

        }
        else{
            System.out.println("Not a prime");
        }
    }
}
