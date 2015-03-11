package LetterCountI;

import java.util.*;

/**
 *
 * @author Hilary Brobbey Have the function LetterCountI(str) take the str
 * parameter being passed and return the first word with the greatest number of
 * repeated letters. For example: "Today, is the greatest day ever!" should
 * return greatest because it has 2 e's (and 2 t's) and it comes before ever
 * which also has 2 e's. If there are no words with repeating letters return -1.
 * Words will be separated by spaces.
 */
class Function {

    String LetterCountI(String str) {

        //str = str.toLowerCase();
        String[] wordArray = str.split("\\s");

        int numRepitition = 0;
        String whichWord = "";
        for (String word : wordArray) {
            word = word.replaceAll("[^A-Za-z]", "");
            int MaxltrCount = 0;
            for (int i = 0; i < word.length(); i++) {
                int ltrCount = 1;
                for (int j = i + 1; j < word.length(); j++) {
                    if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(word.charAt(j))) {
                        ltrCount++;
                    }
                }
                if (ltrCount > MaxltrCount) {
                    MaxltrCount = ltrCount;
                }

            }
            if (MaxltrCount > numRepitition) {
                numRepitition = MaxltrCount;
                whichWord = word;
            }
        }

        return numRepitition > 1 ? whichWord : "-1";

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.LetterCountI(s.nextLine())); 
        System.out.print(c.LetterCountI("Today, is the greatest day ever!"));
    }

}
