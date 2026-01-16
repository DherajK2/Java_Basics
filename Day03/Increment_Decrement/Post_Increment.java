

public class Post_Increment {

    public static void main(String[] args) {
        int a = 10;

        // Post-increment: value is used first, then incremented
        if (a++ == 10) {
            //This statement is executed
            System.out.println("Value of \"a\" in if part: " + a);
        } else {
            System.out.println("Value of \"a\" in else part: " + a);
        }
    }
}
