package DistinctList;
import java.util.*; 


/**
 *
 * @author Hilary Brobbey
 * Have the function DistinctList(arr) take the array of numbers stored in arr and 
 * determine the total number of duplicate entries. For example if the input is [1, 2, 2, 2, 3] 
 * then your program should output 2 because there are two duplicates of one of the elements. 
 */


class Function {  
  int DistinctList(int[] arr) { 
      
      HashMap<Integer, Integer> d = new HashMap<>();
      
      for (int num : arr){
          if (!d.containsKey(num)){
              d.put(num, 1);
          }
          else{
              d.put(num, d.get(num)+1);
          }
      }

    return arr.length - d.keySet().size();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.DistinctList(s.nextLine())); 
    System.out.print(c.DistinctList(new int[]{1, 2, 2, 2, 3})); 
  }   
  
}           
