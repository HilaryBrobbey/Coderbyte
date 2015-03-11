package Palindrome;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function Palindrome(str) take the str parameter being passed and return the string true if 
 * the parameter is a palindrome, (the string is the same forward as it is backward) otherwise return the string false. 
 * For example: "racecar" is also "racecar" backwards. Punctuation and numbers will not be part of the string. 
 */


class Function {  
  boolean Palindrome(String str) { 

      StringBuffer strReverve = new StringBuffer();
      str = str.replaceAll("\\s+", "");
      for (int i =  str.length()-1; i >= 0; i--){
          strReverve.append(str.charAt(i));
      }
      
      return str.equals(strReverve.toString());
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.Palindrome(s.nextLine())); 
     System.out.print(c.Palindrome("racecar")); 
  }
  
}           
