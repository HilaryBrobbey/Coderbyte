package FormattedDivision;
import java.util.*; 
import java.text.NumberFormat;


/**
 *
 * @author Hilary Brobbey
 * Have the function FormattedDivision(num1,num2) take both parameters being passed, 
 * divide num1 by num2, and return the result as a string with properly formatted 
 * commas and 4 significant digits after the decimal place. 
 * For example: if num1 is 123456789 and num2 is 10000 the output should be "12,345.6789". 
 * The output must contain a number in the one's place even if it is a zero. 
 */

class Function {  
    String FormattedDivision(int num1, int num2) { 
      
      double quotient = num1 / (double) num2;
      String strQuotient = NumberFormat.getInstance(Locale.US).format(quotient);

      //System.out.println(NumberFormat.getInstance(Locale.US).format(quotient));
      String whole = strQuotient.substring(0,strQuotient.indexOf("."));
      String decimal = strQuotient.substring(strQuotient.indexOf(".")+1);
      decimal = (decimal + "0000").substring(0, 4);
 
      
      //System.out.println(whole);
      //System.out.println(decimal);
      //System.out.println(String.format("%-4d", Integer.parseInt(decimal)));
    
    return whole + "." + decimal;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.FormattedDivision(s.nextLine())); 
    System.out.print(c.FormattedDivision(123456789,10000));
  }   
  
}           
