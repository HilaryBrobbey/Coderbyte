package StringScramble;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function StringScramble(str1,str2) take both parameters being passed and return the string true 
 * if a portion of str1 characters can be rearranged to match str2, otherwise return the string false. 
 * For example: if str1 is "rkqodlw" and str2 is "world" the output should return true. 
 * Punctuation and symbols will not be entered with the parameters. 

 */


class Function {  
  boolean StringScramble(String str1, String str2) { 
      
     for (char c : str2.toCharArray()){
         if (!str1.contains(""+c)){
             return false;
         }
         str1 = str1.replaceFirst(""+c, str1);
     }
     return true;
         
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.StringScramble(s.nextLine())); 
    System.out.print(c.StringScramble("rkqodlw","world")); 
  }   
  
}           
