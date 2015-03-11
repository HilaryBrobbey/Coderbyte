package PrimeChecker;
import java.util.*;

/**
 *
 * @author Hilary Brobbey
 * Have the function PrimeChecker(num) take num and return 1 if any arrangement of num comes out to be a prime number, otherwise return 0. 
 * For example: if num is 910, the output should be 1 because 910 can be arranged into 109 or 019, both of which are primes. 
 */

class Function {

    private final ArrayList<String> permList = new ArrayList<>();

    int PrimeChecker(int num) {
        
        permute(Integer.toString(num));

        for (String n : permList) {
            if (IsPrime(Integer.parseInt(n)))  {
                return 1;
            }
        }
        return 0;
    }

    public void permute(String str) {
        permute("", str);
    }

    private void permute(String ltr, String str) {
        if (str.length() <= 1) {
            permList.add(ltr + str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String newStr = str.substring(0, i) + str.substring(i + 1);
                permute(ltr + str.charAt(i), newStr);
            }
        }
    }

    private boolean IsPrime(int n) {
        for (int i = 2; i < n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.PrimeChecker(s.nextLine()));
        System.out.print(c.PrimeChecker(910));

    }

}           
