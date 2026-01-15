import java.util.*;

// Program to judge student marks and assign grades
public class MarksJudging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks to be judged: ");
        int marks = sc.nextInt();
        // Determine grade based on marks range
        if(marks>90){
            System.out.println("Outstanding");
        }
        else if(marks>=80){
            System.out.println("Good");
        }
        else if(marks>=70){
            System.out.println("Average");
        }
        else if(marks>=60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
