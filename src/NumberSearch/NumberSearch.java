package NumberSearch;
import java.util.*; 
import java.io.*;


/**
 *
 * @author Hilary Brobbey
 * Have the function NumberSearch(str) take the str parameter, search for all the numbers in the string, 
 * add them together, then return that final number divided by the total amount of letters in the string. 
 * For example: if str is "Hello6 9World 2, Nic8e D7ay!" the output should be 2. 
 * First if you add up all the numbers, 6 + 9 + 2 + 8 + 7 you get 32. Then there are 17 letters in the string. 32 / 17 = 1.882, 
 * and the final answer should be rounded to the nearest whole number, so the answer is 2. 
 * Only single digit numbers separated by spaces will be 
 * used throughout the whole string (So this won't ever be the case: hello44444 world). Each string will also have at least one letter. 
 */

class Function {  
  int NumberSearch(String str) { 
  
    int ltrCount = 0;
    int sum = 0;
      for (int i = 0; i < str.length(); i++){
          if ((""+str.charAt(i)).matches("[A-Za-z]")){
              ltrCount++;
          }
          else if  ((""+str.charAt(i)).matches("\\d")){
            sum += Integer.parseInt(""+str.charAt(i));
          }
      }
      
      double result = sum / (ltrCount * 1.0);
       
    return (int)Math.round(result);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.NumberSearch(s.nextLine())); 
  }   
  
}           
