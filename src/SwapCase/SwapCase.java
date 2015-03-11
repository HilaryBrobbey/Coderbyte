package SwapCase;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function SwapCase(str) take the str parameter and swap the case of each character. 
 * For example: if str is "Hello World" the output should be hELLO wORLD. Let numbers and symbols stay the way they are. 
 */


class Function {  
  String SwapCase(String str) { 

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
    //System.out.print(c.SwapCase(s.nextLine())); 
    System.out.print(c.SwapCase("Hello World")); 
  }   
  
}           

