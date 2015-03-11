package Consecutive;
import java.util.*; 


/**
 *
 * @author Hilary Brobbey
 * Have the function Consecutive(arr) take the array of integers stored in arr 
 * and return the minimum number of integers needed to make the contents of arr consecutive 
 * from the lowest number to the highest number. For example: If arr contains [4, 8, 6] then 
 * the output should be 2 because two numbers need to be added to the array (5 and 7) 
 * to make it a consecutive array of numbers from 4 to 8. Negative numbers may be entered 
 * as parameters and no array will have less than 2 elements. 
 */

class Function {  
    int Consecutive(int[] arr) { 
      
      Arrays.sort(arr);
      int range =  arr[arr.length-1] - arr[0] - arr.length + 1;

    return range;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.Consecutive(s.nextLine())); 
    System.out.print(c.Consecutive(new int[]{4, 8, 6})); 
  }   
  
}           
