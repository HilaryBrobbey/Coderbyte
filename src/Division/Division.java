package Division;
import java.util.*; 


/**
 *
 * @author Hilary Brobbey
 * Have the function Division(num1,num2) take both parameters being passed and return the Greatest Common Factor. 
 * That is, return the greatest number that evenly goes into both numbers with no remainder. 
 * For example: 12 and 16 both are divisible by 1, 2, and 4 so the output should be 4. 
 * The range for both parameters will be from 1 to 10^3. 
 */


class Function {  
  int Division(int num1, int num2) { 
      
      int gcd = 1;
      for (int i = 1; i <= num1; i++){
          if (num1 % i == 0 && num2 % i == 0){
              gcd = i;
          }
      }

    return gcd;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.Division(s.nextLine())); 
    System.out.print(c.Division(12,16)); 
  }   
  
}           
