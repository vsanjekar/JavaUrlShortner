package UrlShortener;

/**
 * Created by vinay on 10/18/16.
 */
public class UrlConverter {
    /*
    private static String getAlpha(long num) {

        String result = "";
        while (num > 0) {
            num--; // 1 => a, not 0 => a
            long remainder = num % 26;
            char digit = (char) (remainder + 97);
            result = digit + result;
            num = (num - remainder) / 26;
        }
        return result;
    }
    */

    public static long getId(String idRep) {
        return Long.parseLong(idRep);
    }


    public static String getIdRep(long id) {
        return Long.toString(id);
    }
}
