import java.util.Scanner;

public class Fibonnaci1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nth term: ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println(0);
        }
        else if(n == 1){
            System.out.println(1);
        }
        else{
            int next =0;
            int first = 0;int second=1;
            for(int i =2;i<=n;i++){
                next = second + first;
                
                first = second;
                second =next;

            }
            System.out.println(second);
        }
    }
}
