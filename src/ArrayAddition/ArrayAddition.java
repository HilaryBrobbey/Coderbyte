package ArrayAddition;
import java.util.*; 


/**
 *
 * @author Hilary Brobbey
 * Have the function ArrayAddition(arr) take the array of numbers stored in arr and return the string true 
 * if any combination of numbers in the array can be added up to equal the largest number in the array, 
 * otherwise return the string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the 
 * output should return true because 4 + 6 + 10 + 3 = 23. The array will not be empty, 
 * will not contain all the same elements, and may contain negative numbers. 
 */


class Function {  
  boolean ArrayAddition(int[] arr) {

        Arrays.sort(arr);
        int target = arr[arr.length - 1];
        //System.out.println(target);
        int[] arr2 = Arrays.copyOfRange(arr, 0, arr.length - 1);

        for (int i = 1; i < Math.pow(2, arr2.length); i++) {
            String bit = String.format("%0" + arr2.length + "d", Integer.parseInt(Integer.toBinaryString(i)));
            //System.out.println(bit);
            int sum = 0;
            for (int j = 0; j < bit.length(); j++) {
                if (bit.charAt(j) == '1') {
                    sum += arr2[j];
                }
            }
            //System.out.println(sum);
            if (sum == target) {
                return true;
            }
        }

        return false;
    }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.ArrayAddition(s.nextLine())); 
    System.out.print(c.ArrayAddition(new int[]{4, 6, 23, 10, 1, 3})); 
  }   
  
}           
