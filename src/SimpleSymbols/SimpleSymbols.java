package SimpleSymbols;

import java.util.*;

/**
 *
 * @author Hilary Brobbey 
 * Have the function SimpleSymbols(str) take the str
 * parameter being passed and determine if it is an acceptable sequence by
 * either returning the string true or false. The str parameter will be composed
 * of + and = symbols with several letters between them (ie. ++d+===+c++==a) and
 * for the string to be true each letter must be surrounded by a + symbol. So
 * the string to the left would be false. The string will not be empty and will
 * have at least one letter.
 */
class Function {
    String SimpleSymbols(String str) {

        String pattern = "((\\.*)([+]+)([a-zA-z])([+]+)(\\.*))+";

        return str.matches(pattern) ? "true" : "false";

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.SimpleSymbols(s.nextLine()));
        System.out.print(c.SimpleSymbols("++d+===+c++==a"));
    }

}
