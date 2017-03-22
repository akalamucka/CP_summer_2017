/**
<<<<<<< HEAD
 * Created by ak63575 on 3/8/2017.
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int a;

        a = 5;
        int b = ++a;
// moze byc a++ i to bedzie co innego znaczylo
        // b = b + 5

        a = 6;
        a++;
        // a--
        // --a

        b = a;

        b = b + 5;
        //b = 5 + 7;
        b = b * 3;
        a = a / 4;

        // The remaining part from integer division

        int c = 11 % 4;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println("c=" + c);

        double d1 = 45.5;
        double d2 = 5.2;
        double d3 = d1 / d2;

        System.out.println(d3);

        Float f1 = new Double(d3).floatValue();
        f1 = new Integer(b).floatValue();

        System.out.println(f1);

        Integer i1 = f1.intValue();

        System.out.println(i1);
    }
}