package MultiplicativePersistence;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function MultiplicativePersistence(num) take the num parameter 
 * being passed which will always be a positive integer and return its multiplicative persistence which is the number of times 
 * you must multiply the digits in num until you reach a single digit. 
 * For example: if num is 39 then your program should return 3 because 3 * 9 = 27 then 2 * 7 = 14 and finally 1 * 4 = 4 and you stop at 4. 
 */

class Function {  
  int MultiplicativePersistence(int num) { 
      
      if (num < 10){return 0;}
      String strNum = Integer.toString(num);
      int product = 1;
      for (int i = 0; i < strNum.length(); i++){
          product *= Integer.parseInt(strNum.substring(i, i+1));
      }
       
    return MultiplicativePersistence(product) + 1;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.MultiplicativePersistence(s.nextLine())); 
    System.out.print(c.MultiplicativePersistence(39)); 
  }   
  
}           
