package SwapII;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function SwapII(str) take the str parameter and swap the case of each character. 
 * Then, if a letter is between two numbers (without separation), 
 * switch the places of the two numbers. 
 * For example: if str is "6Hello4 -8World, 7 yes3" the output should be 4hELLO6 -8wORLD, 7 YES3. 
 */

class Function {  
  String SwapII(String str) { 
  
    char[] lettersArray = str.toCharArray();
      StringBuffer sb = new StringBuffer();
      for (char ltr : lettersArray){
          sb.append(Character.isLowerCase(ltr) ? Character.toUpperCase(ltr) : Character.toLowerCase(ltr));
      }
      
      return sb.toString();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.SwapII(s.nextLine())); 
  }   
  
}           
