/**
 * Created by egeoz on 7/21/2017.
 */
public class leettonormal {

    public static String leettonormal(String text){
        String out ="";
        for(int i = 0 ; i<text.length() ;i++){
           char c = text.charAt(i);
           switch(c){
               case '0':
                   out += "o";
                   break;
               case '1':
                   out += "i";
                   break;
               case '2':
                   out +="r";
                   break;
               case '3':
                   out +="e";
                   break;
               case '4':
                   out+="a";
                   break;
               case '5':
                   out += "s";
                   break;
               case '6':
                   out += "g";
                   break;
               case '7':
                   out += "t";
                   break;

               case '8':
                   out+="b";
                   break;
               case '9':
                   out += "q";
                   break;
               default:
                   out += c;
                   break;
           }
        }
        return out;
    }

    public static void main(String[] args) {
        String test = "d1353 m17731lung d13n7 4l5 b3w315 d4fu3r ";
        leettonormal ltn = new leettonormal();
        System.out.println(ltn.leettonormal(test));
    }
}
