package FirstFactorial;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function FirstFactorial(num) take the num parameter being passed 
 * and return the factorial of it (ie. if num = 4, return (4 * 3 * 2 * 1)). 
 * For the test cases, the range will be between 1 and 18. 
 */


class Function {  
  int FirstFactorial(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    if (num < 2){
      return 1;
    }
    else
    return num * FirstFactorial(num-1);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstFactorial(4)); 
  }   
  
}           
