package LetterChanges;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm. 
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a). 
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string. 
 */

class Function {  
  String LetterChanges(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    
    StringBuffer strChanged = new StringBuffer();
    for (int i = 0; i < str.length(); i++){
      char c = Character.toLowerCase(str.charAt(i));
      int ascii = (int)c;
      if (ascii == 122){ //z
        ascii = 1;
      }
      else if (ascii == 32){ //space
        ascii = 32;
      }
      else if (ascii < 97 || ascii > 122){ //^a-z
        ascii = ascii;
      }
      else{
        ascii += 1;
      }
      char newChar = (char)ascii;
      if ( (Character.toString(newChar)).matches("[aeiou]")){
        newChar = Character.toUpperCase(newChar);
      }
      strChanged.append(newChar);
    }
    
    return strChanged.toString();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterChanges("Algorithm")); 
    //System.out.print(c.LetterChanges(s.nextLine())); 
  }   
  
}           
