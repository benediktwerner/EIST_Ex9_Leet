/**
 * Created by egeoz on 7/21/2017.
 */
public class leettonormal {

    public static String leettonormal(String text){
        String out = text;
        out =  out.replaceAll("0" , "o");
        out = out.replaceAll("1" , "i");
        out =   out.replaceAll("2","r");
        out =out.replaceAll("3" , "e");
        out = out.replaceAll("4" , "a");
        out= out.replaceAll("5","s");
        out= out.replaceAll("6","g");
        out= out.replaceAll("7" , "t");
        out=  out.replaceAll("8","b");
        out=  out.replaceAll("9","q");
        return out;
    }

    public static void main(String[] args) {
        String test = "d1353 m17731lung d13n7 4l5 b3w315 d4fu3r ";
        leettonormal ltn = new leettonormal();
        System.out.println(ltn.leettonormal(test));
    }
}
