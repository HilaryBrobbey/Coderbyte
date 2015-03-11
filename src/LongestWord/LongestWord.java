package LongestWord;
import java.util.*;

/**
 *
 * @author Hilary Brobbey
 * Have the function LongestWord(sen) take the sen parameter being passed and return 
 * the largest word in the string. If there are two or more words that are the same length, 
 * return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. 
 */

class Function {
    String LongestWord(String sen) {
        String senWithoutPunctuation = sen.replaceAll("\\W", " ");
        String[] words = senWithoutPunctuation.split("\\s");
        String LongestWordSoFar = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > LongestWordSoFar.length()) {
                LongestWordSoFar = words[i];
            }
        }
        return LongestWordSoFar;
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.LongestWord(s.nextLine()));
        System.out.print(c.LongestWord("Fake it till you make it."));
    }

}
