
public class Precedence {
    public static void main(String[] args) {
        int x =2, y=5;
        //precedence of { brackets > */ > +- } same precednce will have left to right fashion
        int exp1=(y*(x/y+x/y));
        int exp2=(y*x/y+y*x/y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
