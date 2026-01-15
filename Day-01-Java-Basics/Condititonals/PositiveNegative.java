import java.util.*;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be judged:");
        int num= sc.nextInt();

        if(num>0){
            System.out.println("The number is Positive");
        }
        else if(num<0){
            System.out.println("The Number is Negative");
        }
        else{
            System.out.println("The number is 0");

        }
       



        sc.close();
    }
}
