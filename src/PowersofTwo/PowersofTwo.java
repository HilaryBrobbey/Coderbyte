package PowersofTwo;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function PowersofTwo(num) take the num parameter being passed which will be an integer and return 
 * the string true if it's a power of two. If it's not return the string false. 
 * For example if the input is 16 then your program should return the string true 
 * but if the input is 22 then the output should be the string false. 
 */

class Function {  
  boolean PowersofTwo(int num) { 
    
    int product = 1;
    while (product < num){
      product *= 2;
      
    }
       
    return (product == num);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.PowersofTwo(s.nextLine())); 
    System.out.print(c.PowersofTwo(64)); 
  }   
  
}           
