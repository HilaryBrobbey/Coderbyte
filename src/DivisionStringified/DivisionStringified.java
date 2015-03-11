package DivisionStringified;
import java.util.*; 
import java.text.NumberFormat;

/**
 *
 * @author Hilary Brobbey
 * Have the function DivisionStringified(num1,num2) take both parameters being passed, 
 * divide num1 by num2, and return the result as a string with properly formatted commas. 
 * If an answer is only 3 digits long, return the number with no commas 
 * (ie. 2 / 3 should output "1"). For example: if num1 is 123456789 and num2 is 10000 the output should be "12,345". 
 */


class Function {  
    String DivisionStringified(int num1, int num2) {

        int quotient = 0;
        if (num1 / num2 < 1000) {
            quotient = (int) Math.ceil(num1 / (num2 * 1.0));
        } else {
            quotient = (int) Math.floor(num1 / (num2 * 1.0));
        }
        Locale.setDefault(Locale.US);
        String strQuotient = NumberFormat.getInstance(Locale.US).format(quotient);

        return strQuotient;

    }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.DivisionStringified(s.nextLine())); 
    System.out.print(c.DivisionStringified(123456789,10000)); 
  }   
  
}           
