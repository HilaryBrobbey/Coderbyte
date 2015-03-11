package SimpleMode;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function SimpleMode(arr) take the array of numbers stored in arr and return the number 
 * that appears most frequently (the mode). For example: if arr contains [10, 4, 5, 2, 4] 
 * the output should be 4. If there is more than one mode return the one that appeared in the array first (ie. [5, 10, 10, 6, 5] 
 * should return 5 because it appeared first). If there is no mode return -1. The array will not be empty. 
 */


class Function {  
  int SimpleMode(int[] arr) { 
      
      LinkedHashMap<Integer, Integer> dict = new LinkedHashMap<>();
      for (int i : arr){
          if (!dict.containsKey(i)){
              dict.put(i, 1);
          }
          else{
              dict.put(i, dict.get(i)+1);
          }
      }
      
      int frequency = 0;
      int mode = 0;
      for (int i : dict.keySet()){
          if (dict.get(i) > frequency){
              frequency = dict.get(i);
              mode = i;
          }  
      }
      
      return mode;

    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.SimpleMode(s.nextLine())); 
    System.out.print(c.SimpleMode(new int[]{5, 10, 10, 6, 5})); 
  }   
  
}           
