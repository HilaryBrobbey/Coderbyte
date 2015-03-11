package RunLength;
import java.util.*; 


/**
 *
 * @author Hilary Brobbey
 * Have the function RunLength(str) take the str parameter being passed and return a compressed version 
 * of the string using the Run-length encoding algorithm. This algorithm works by taking the occurrence of 
 * each repeating character and outputting that number along with a single character of the repeating sequence. 
 * For example: "wwwggopp" would return 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols. 
 */

class Function {  
 String RunLength(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        char previous = ' ';
        for (char c : str.toCharArray()) {
            if (previous == c || previous == ' ') {
                count++;
                previous = c;
            } else {
                sb.append(Integer.toString(count)).append(previous);
                previous = c;
                count = 1;
            }
        }

        return sb.append(count).append(previous).toString();

    }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.RunLength(s.nextLine())); 
    System.out.print(c.RunLength("wwwggopp")); 
  }   
  
}           
