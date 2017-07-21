
public class LeetTranslator {
    private static String[] leetDict = {
            "o", //0
            "1", //1
            "z", //2
            "e", //3
            "a", //4
            "s", //5
            "g", //6
            "t", //7
            "b", //8
            "p", //9
    };
    
    public static String translateToLeet(String text) {
        String output = text.toLowerCase();
        
        for (int i = 0; i < leetDict.length; i++)
            output.replaceAll(leetDict[i], i+"");
        
        return output;
    }
    
    public static String translateFromLeet(String leet) {
        String output = leet.toLowerCase();
        
        for (int i = 0; i < leetDict.length; i++)
            output.replaceAll(i+"", leetDict[i]);
        
        return output;
    }
}
