package LetterCapitalize;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function LetterCapitalize(str) take the str parameter being passed 
 * and capitalize the first letter of each word. Words will be separated by only one space. 

 */


class Function {  
  String LetterCapitalize(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    
    StringBuffer sb = new StringBuffer();
    String[] words = str.split("\\s");
    for (int i = 0; i < words.length; i++){
      sb.append(Character.toUpperCase(words[i].charAt(0)));
      sb.append(words[i].substring(1));
      sb.append(" ");       
    }
    return sb.toString().trim();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.LetterCapitalize(s.nextLine())); 
    System.out.print(c.LetterCapitalize("fake it till you make it.")); 
  }   
  
}           
