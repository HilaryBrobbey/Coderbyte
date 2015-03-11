package SimpleAdding;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function SimpleAdding(num) add up all the numbers from 1 to num. 
 * For the test cases, the parameter num will be any number from 1 to 1000. 
 */

class Function {  
  int SimpleAdding(int num) { 
  
    if (num <= 1){
     return 1; 
    }
    return num + SimpleAdding(num-1);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.SimpleAdding(s.nextLine())); 
    System.out.print(c.SimpleAdding(78)); 
  }   
  
}           
