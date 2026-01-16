
import java.util.*;

//WAP to take user input and say wheteher the number is odd or even let it be upto 5 num

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            int num = sc.nextInt();
            if(num%2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
    
}
