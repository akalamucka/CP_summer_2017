/**
 * Created by ak63575 on 3/15/2017.
 */
public class email {
    public static void main(String[] args) {


        String possibleEmail;
        String[] segments = possibleEmail.split("@");
        if (segments != 2) return false;
        if (segments[0].isEmpty() || segments[1].isEmpty()) return false;
        String[] domainSegments = segments[1].split(".");
        if (domainSegments.length < 2) return false;
    }

}
