/**
 * Created by egeoz on 7/21/2017.
 */
public class LeetToNormal {
    public static String leetToNormal(String text) {
        String out = text;
        out = out.replaceAll("0", "o");
        out = out.replaceAll("1", "l");
        out = out.replaceAll("2", "r");
        out = out.replaceAll("3", "e");
        out = out.replaceAll("4", "a");
        out = out.replaceAll("5", "s");
        out = out.replaceAll("6", "g");
        out = out.replaceAll("7", "t");
        out = out.replaceAll("8", "b");
        out = out.replaceAll("9", "p");
        return out;
    }
}
