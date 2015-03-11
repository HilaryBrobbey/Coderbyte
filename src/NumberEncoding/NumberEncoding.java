package NumberEncoding;
import java.util.*;
import java.util.regex.Pattern;

/**
 *
 * @author Hilary Brobbey Have the function NumberEncoding(str) take the str
 * parameter and encode the message according to the following rule: encode
 * every letter into its corresponding numbered position in the alphabet.
 * Symbols and spaces will also be used in the input. For example: if str is
 * "af5c a#!" then your program should return 1653 1#!.
 */

class Function {
    String NumberEncoding(String str) {
        StringBuilder strEncoded = new StringBuilder();
        for (char c : str.toLowerCase().toCharArray()) {
            if (Pattern.matches("[a-z]", c + "")) {
                strEncoded.append((int) c - 96);
            } else {
                strEncoded.append(c);
            }
        }
        return strEncoded.toString();
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.NumberEncoding(s.nextLine()));
    }

}
