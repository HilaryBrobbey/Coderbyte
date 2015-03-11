package AdditivePersistence;
import java.util.*; 
/**
 *
 * @author Hilary Brobbey
 * Have the function AdditivePersistence(num) take the num parameter being passed which will always be a 
 * positive integer and return its additive persistence which is the number of 
 * times you must add the digits in num until you reach a single digit. 
 * For example: if num is 2718 then your program should return 2 because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9. 
 */


class Function {  
  int AdditivePersistence(int num) {
    
        if (num < 10){return 0;}

        int addictivePersistence = 0;
        int sum = 0;
        String strNum = Integer.toString(num);
        boolean greaterThanTen = true;
        while (greaterThanTen) {
            for (int i = 0; i < strNum.length(); i++) {
                sum += Integer.parseInt(strNum.substring(i, i+1));
            }
            if (sum < 10) {
                greaterThanTen = false;
            } else {
                strNum = Integer.toString(sum);
                sum = 0;           
            }
          addictivePersistence++;
        }

        return addictivePersistence;

    }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //ystem.out.print(c.AdditivePersistence(s.nextLine())); 
    System.out.print(c.AdditivePersistence(2718));
  }   
  
}           

