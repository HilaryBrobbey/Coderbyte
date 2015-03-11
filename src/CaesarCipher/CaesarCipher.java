package CaesarCipher;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function CaesarCipher(str,num) take the str parameter and perform a 
 * Caesar Cipher shift on it using the num parameter as the shifting number. 
 * A Caesar Cipher works by shifting each letter in the string N places down in the alphabet 
 * (in this case N will be num). Punctuation, spaces, and capitalization should remain intact. 
 * For example if the string is "Caesar Cipher" and num is 2 the output should be "Ecguct Ekrjgt". 
 */


class Function {  
  String CaesarCipher(String str, int num) { 
      
      StringBuilder sb = new StringBuilder();
      for (char c : str.toCharArray()){
          String ltr = ""+c;
          if (ltr.matches("[A-Za-z]")){
              int cipher = c + num;
              if (cipher > 90 && Character.isUpperCase(c)){
                  cipher = 64 + (cipher - 90);
              }
              if (cipher > 122 && Character.isLowerCase(c)){
                  cipher = 96 + (cipher - 122);
              }     
              sb.append(Character.toString((char)cipher));
          }
          else{
              sb.append(ltr);
          }
      }

    return sb.toString();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.CaesarCipher(s.nextLine())); 
    System.out.print(c.CaesarCipher("Caesar Cipher",2)); 
  }   
  
}           
