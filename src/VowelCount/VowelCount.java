package VowelCount;
import java.util.*; 


/**
 *
 * @author Hilary Brobbey
 * Have the function VowelCount(str) take the str string parameter being passed 
 * and return the number of vowels the string contains (ie. "All cows eat grass" would return 5). 
 * Do not count y as a vowel for this challenge.
 */


class Function {  
  int VowelCount(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String vowels = "[aeiou]";
    int count = 0;
    for (int i = 0; i < str.length(); i++){
      if (((str.substring(i,i+1)).toLowerCase()).matches(vowels)){
       count += 1; 
      }
      
    }
    
    return count;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.VowelCount(s.nextLine())); 
    System.out.print(c.VowelCount("All cows eat grass")); 
  }   
  
}           

