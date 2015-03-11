package TripleDouble;

import java.util.*;

/**
 *
 * @author Hilary Brobbey
 * Have the function TripleDouble(num1,num2) take both parameters being passed, 
 * and return 1 if there is a straight triple of a number at any place in num1 and 
 * also a straight double of the same number in num2. 
 * For example: if num1 equals 451999277 and num2 equals 41177722899, then return 1 
 * because in the first parameter you have the straight triple 999 
 * and you have a straight double, 99, of the same number in the second parameter. If this isn't the case, return 0. 
 */
class Function {
    int TripleDouble(int num1, int num2) {

        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);

        if (strNum1.length() < 3
                || strNum2.length() < 2) {
            return 0;
        }

        for (int i = 0; i < strNum1.length() - 3; i++) {
            if (strNum1.charAt(i) == strNum1.charAt(i + 1)
                    && strNum1.charAt(i) == strNum1.charAt(i + 2)) {

                for (int j = 0; j < strNum2.length() - 2; i++) {
                    if (strNum2.charAt(j) == strNum2.charAt(j + 1)
                            && strNum2.charAt(j) == strNum1.charAt(i)) {
                        return 1;
                    }

                }

            }
        }
        return 0;

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.TripleDouble(4599977,7722899));
        //System.out.print(c.TripleDouble(s.nextLine()));
    }

}
