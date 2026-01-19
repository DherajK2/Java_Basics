
import java.util.Scanner;

public class FindNCRUsingFunct {
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        int i = num;
        int fact =1;
        while(i !=0){
            fact *= i;
            i--;
        }
        return fact;
    }

    public static int NCR(int a , int b){
        int ans = 0;

        ans = factorial(a)/((factorial(a -b)) * factorial(b));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int result = NCR(n,r);

        System.out.println("The result :" + result);
        sc.close();
    }
}
