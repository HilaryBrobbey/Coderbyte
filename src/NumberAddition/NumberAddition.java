package NumberAddition;
import java.util.*;

/**
 *
 * @author Hilary Brobbey Have the function NumberSearch(str) take the str
 * parameter, search for all the numbers in the string, add them together, then
 * return that final number. For example: if str is "88Hello 3World!" the output
 * should be 91. You will have to differentiate between single digit numbers and
 * multiple digit numbers like in the example above. So "55Hello" and "5Hello 5"
 * should return two different answers. Each string will contain at least one
 * letter or symbol.
 */
class Function {
    int NumberAddition(String str) {

        String[] strArray = str.split("[^0-9]");

        int sum = 0;
        for (String number : strArray) {
            number = number.replaceAll("[^0-9]", "");
            if (!number.equals("")) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.NumberAddition(s.nextLine())); 
        System.out.print(c.NumberAddition("88Hello 3World!"));
    }

}
