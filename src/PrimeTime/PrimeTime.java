package PrimeTime;
import java.util.*;

/**
 *
 * @author Hilary Brobbey
 * Have the function PrimeTime(num) take the num parameter being passed 
 * and return the string true if the parameter is a prime number, 
 * otherwise return the string false. The range will be between 1 and 2^16. 
 */


class Function {  
  boolean PrimeTime(int num) { 
      
      for (int i = 2; i < num; i++){
          if (num % i == 0){
              return false;
          }
          
      }
       
    return true;
    
  } 
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.PrimeTime(s.nextLine())); 
    System.out.print(c.PrimeTime(73)); 
  }   
  
}           
