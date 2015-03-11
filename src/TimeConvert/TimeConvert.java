package TimeConvert;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function TimeConvert(num) take the num parameter being passed and return the number of hours and minutes the 
 * parameter converts to (ie. if num = 63 then the output should be 1:3). Separate the number of hours and minutes with a colon. 
 */

class Function {  
  String TimeConvert(int num) { 

    return Integer.toString(num / 60) + ":" + Integer.toString(num % 60);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.TimeConvert(s.nextLine())); 
    System.out.print(c.TimeConvert(63)); 
  }   
  
}           

