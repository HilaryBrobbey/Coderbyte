package PalindromeTwo;
import java.util.*; 



/**
 *
 * @author Hilary Brobbey
 * Have the function PalindromeTwo(str) take the str parameter being passed 
 * and return the string true if the parameter is a palindrome, (the string is the same forward as it is backward) 
 * otherwise return the string false. The parameter entered may have punctuation and symbols but they should not affect 
 * whether the string is in fact a palindrome. For example: "Anne, I vote more cars race Rome-to-Vienna" should return true. 
 */

class Function {  
  boolean PalindromeTwo(String str) { 
      StringBuilder reverse = new StringBuilder();
      str = str.toLowerCase().replaceAll("[^a-z]", "");
      
      for (int i = str.length()-1; i >= 0; i--){
          reverse.append(str.charAt(i));   
      }
      
      return str.equals(reverse.toString());

    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.PalindromeTwo(s.nextLine())); 
  }   
  
}           
