package FibonacciChecker;
import java.util.*;

/**
 *
 * @author Hilary Brobbey
 * Have the function FibonacciChecker(num) return the string yes if the number given is part 
 * of the Fibonacci sequence. This sequence is defined by: Fn = Fn-1 + Fn-2, 
 * which means to find Fn you add the previous two numbers up. 
 * The first two numbers are 0 and 1, then comes 1, 2, 3, 5 etc. If num is not in the Fibonacci sequence, return the string no. 

 */

class Function {

    String FibonacciChecker(int num) {

        for (int i = 0; i < num; i++) {
            if (fibonacci(i) == num) {
                return "yes";
            }
            if (fibonacci(i) > num) {
                return "no";
            }
        }
        return "no";
    }

    int fibonacci(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.FibonacciChecker(s.nextLine())); 
        System.out.print(c.FibonacciChecker(54));
    }

}           
