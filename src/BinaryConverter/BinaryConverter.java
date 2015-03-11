package BinaryConverter;

import java.util.*;

/**
 *
 * @author Hilary Brobbey 
 * Have the function BinaryConverter(str) return the
 * decimal form of the binary value. For example: if 101 is passed return 5, or
 * if 1000 is passed return 8.
 */
class Function {
    int BinaryConverter(String str) {

        int pos = str.length() - 1;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.substring(i, i + 1)) * Math.pow(2, pos);
            pos--;
        }

        return sum;

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.BinaryConverter(s.nextLine()));
    }

}
