/**
 * Created by ak63575 on 3/22/2017.
 */
public class bowlsRecursion {
    static int v1 = 0;

    public static int countBowls(int row) {
        if (row == 1) return 1;
        else return countBowls(row - 1) + 2;
        //v1 = 4;
        //return 4;
    }

    public static void main(String[] args) {
        int sum = countBowls(5);

        System.out.println(sum);
    }
}

