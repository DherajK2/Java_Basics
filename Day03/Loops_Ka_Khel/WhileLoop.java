

import java.util.Scanner;

public class WhileLoop {
    
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testTill =5;
        while(testTill > 0){

       
            int num = sc.nextInt();
            if(num%2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
            testTill--;
        }
    }
    
}

