
import java.util.*;
// A simple program demonstrating conditional statements in Java
public class Conditinal {
    public static void main(String[] args) {
        int a =9;
        // Check if a is less than 5 and modify its value accordingly
        if(a<5){
            System.out.println("a is less than 5");
            a=10;
        }
        else{
            System.out.println("a is greater than 5");
            a=8;
        }       
        
        System.out.println(a);
    }
}
