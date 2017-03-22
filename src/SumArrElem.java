import java.text.DecimalFormatSymbols;
import java.util.DoubleSummaryStatistics;

/**
 * Created by ak63575 on 3/22/2017.
 */
public class SumArrElem {

    static Double sumArray(Double[] arr) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i]; //result= result + arr[i]
        }

        return result;
    }

    public static void main(String[] args) {
        Double[] arDb = new Double[]{
                45.54, 53.23, 24.34
        };

        Double sum = sumArray(arDb);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println();

        System.out.printIn(sumArray(arDb));

    }
}
