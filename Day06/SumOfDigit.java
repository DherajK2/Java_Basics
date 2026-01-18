import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int n = sc.nextInt();

        int sum=0;
        
        while(n>0){
            
            int r = n % 10;
            n = n / 10;
            sum+=r;
           
        }

        System.out.println(sum);
    }
}
