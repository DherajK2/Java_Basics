

public class Pre_Increment {

    public static void main(String[] args) {
        int a = 10;

        // Pre-increment: value is incremented first, then used
        if (++a == 10) {
            System.out.println("Value of \"a\" in if part: " + a);
        } else {
            //This statement is executed
            System.out.println("Value of \"a\" in else part: " + a);
        }
    }
}
