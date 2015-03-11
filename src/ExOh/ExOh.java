package ExOh;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function ExOh(str) take the str parameter being passed and return the string true 
 * if there is an equal number of x's and o's, otherwise return the string false. 
 * Only these two letters will be entered in the string, no punctuation or numbers. 
 * For example: if str is "xooxxxxooxo" then the output should return false because there are 6 x's and 5 o's. 
 */

class Function {  
  boolean ExOh(String str) { 
    
    if (str.length() % 2 != 0){return false;}  
    int countX = 0, countO = 0;
    for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) == 'x'){
            countX++;
        }
        if (str.charAt(i) == 'o'){
            countO++;
        }
    }   
    return countX == countO;

  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.ExOh(s.nextLine())); 
    System.out.print(c.ExOh("xooxxxxooxo")); 
  }   
  
}           
