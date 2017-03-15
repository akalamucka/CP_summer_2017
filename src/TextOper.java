<<<<<<< HEAD
import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by ak63575 on 3/8/2017.
=======
/**
 * Created by prubac on 3/8/2017.
>>>>>>> upstream/master
 */
public class TextOper {

    public static void main(String[] args) {
<<<<<<< HEAD
=======

>>>>>>> upstream/master
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;

<<<<<<< HEAD
        int posBC = s3.indexOf("ab");
=======
        int posBC = s3.lastIndexOf("ab");
>>>>>>> upstream/master

        String s4 = s3.substring(2, 4);

        s4 = s3.replace("ab", "AB");
<<<<<<< HEAD
        s4 = s4.toUpperCase();
        int s4len = s4.length();

        System.out.println(s4);
        System.out.println(s3);
        System.out.println(posBC);
=======

        s4 = s4.toUpperCase();

        int s4len = s4.length();

        System.out.println(s3);
        System.out.println(posBC);
        System.out.println(s4);
>>>>>>> upstream/master
        System.out.println(s4len);

        char c1 = s4.charAt(4);

        System.out.println(c1);

<<<<<<< HEAD
        if (s4.contains("F")) {
            System.out.println("s4 contains F");
        } else {
            System.out.println("s4 doesn't contain F");
        }
=======
        // &&  - AND
        // ||  - OR
>>>>>>> upstream/master

        if (s4.contains("F") && (s4.length() < 7)) {
            System.out.println("s4 contains F");
        } else {
            System.out.println("s4 doesn't contain F");
        }
<<<<<<< HEAD
=======


>>>>>>> upstream/master
    }
}
