package FirstReverse;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order. 
*/


class Function {  
  String FirstReverse(String str) { 
    
    int len = str.length();
    String acc = "";
    
    for (int i = len-1; i >= 0; i--){
      acc += str.charAt(i);
    }
    
    str = acc;
    
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.FirstReverse(s.nextLine()));
    System.out.print(c.FirstReverse("Reverse"));
  }   
  
}           
