
public class Leetspeak
{
    static String normalToLeet(String text){

        text = text.replaceAll("A", "a");
        text = text.replaceAll("B", "b");
        text = text.replaceAll("E", "e");
        text = text.replaceAll("L", "l");
        text = text.replaceAll("G", "g");
        text = text.replaceAll("O", "o");
        text = text.replaceAll("P", "p");
        text = text.replaceAll("T", "t");
        text = text.replaceAll("S", "s");
        text = text.replaceAll("R", "r");

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

    public static void main(String[] args) {

        String text = "Hallo, das ist ein Text!";

        System.out.println(normalToLeet(text));
    }
}
