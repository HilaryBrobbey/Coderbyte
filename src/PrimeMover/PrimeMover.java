package PrimeMover;
import java.util.*;
/**
 *
 * @author Hilary Brobbey
 * Have the function PrimeMover(num) return the numth prime number. 
 * The range will be from 1 to 10^4. For example: if num is 16 the output should be 53 as 53 is the 16th prime number. 

 */


class Function {

    int PrimeMover(int num) {

        int count = 0;
        for (int i = 0; i < Math.pow(10, 4); i++) {
            if (IsPrime(i)) {
                count++;
            }
            if (count == num){
                return i;
            }
        }
        
    return (int) Double.POSITIVE_INFINITY;
}

private boolean IsPrime(int number) {
        if (number < 2){return false;}
        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.PrimeMover(s.nextLine()));
        System.out.print(c.PrimeMover(16));
    }

}           
