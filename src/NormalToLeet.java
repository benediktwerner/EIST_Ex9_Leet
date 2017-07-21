
public class NormalToLeet {
    static String normalToLeet(String text) {
        text = text.toLowerCase();

        text = text.replaceAll("a", "4");
        text = text.replaceAll("b", "8");
        text = text.replaceAll("e", "3");
        text = text.replaceAll("l", "1");
        text = text.replaceAll("g", "6");
        text = text.replaceAll("o", "0");
        text = text.replaceAll("p", "9");
        text = text.replaceAll("t", "7");
        text = text.replaceAll("s", "5");
        text = text.replaceAll("r", "2");

        return text;
    }
}
