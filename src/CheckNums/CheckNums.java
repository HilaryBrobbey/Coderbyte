package CheckNums;

import java.util.*;

/**
 *
 * @author Hilary Brobbey Have the function CheckNums(num1,num2) take both
 * parameters being passed and return the string true if num2 is greater than
 * num1, otherwise return the string false. If the parameter values are equal to
 * each other then return the string -1.
 */
class Function {
    String CheckNums(int num1, int num2) {

        if (num1 == num2) {
            return "-1";
        }

        return (num2 > num1) ? "true" : "false";

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.CheckNums(s.nextLine()));
        System.out.print(c.CheckNums(25,17));
    }

}
