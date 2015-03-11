package ThreeFiveMultiples;
import java.util.*;


/**
 *
 * @author Hilary Brobbey
 * Have the function ThreeFiveMultiples(num) return the sum of all the multiples of 3 and 5 
 * that are below num. For example: if num is 10, the multiples of 3 and 5 that are below 10 are 3, 5, 6, and 9, 
 * and adding them up you get 23, so your program should return 23. The integer being passed will be between 1 and 100. 
 */


class Function {

    int ThreeFiveMultiples(int num) {

        int sum = 0;

        int threeMult = 3;
        int i = 2;
        while (threeMult < num) {
            //System.out.println(threeMult);
            if (threeMult % 15 != 0) {//Not divisible by both 3 and 5
                sum += threeMult;
            }
            threeMult = 3 * i;
            i++;
        }

        System.out.println();

        int fiveMult = 5;
        int j = 2;
        while (fiveMult < num) {
            //System.out.println(fiveMult);
            sum += fiveMult;
            fiveMult = 5 * j;
            j++;
        }

        return sum;

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.ThreeFiveMultiples(s.nextLine()));
        System.out.print(c.ThreeFiveMultiples(31));
    }

}           
