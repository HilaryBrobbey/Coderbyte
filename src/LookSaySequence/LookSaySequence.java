package LookSaySequence;
import java.util.*; 

/**
 *
 * @author Hilary Brobbey
 * Have the function LookSaySequence(num) take the num parameter being passed and return the next number in 
 * the sequence according to the following rule: to generate the next number in a sequence read off the 
 * digits of the given number, counting the number of digits in groups of the same digit. 
 * For example, the sequence beginning with 1 would be: 1, 11, 21, 1211, ... The 11 comes from there being "one 1" before it and the 21 
 * comes from there being "two 1's" before it. So your program should return the next number in the sequence given num. 
 */

class Function {  
  int LookSaySequence(int num) {

        String strNUM = Integer.toString(num);

        StringBuilder sb = new StringBuilder();
        int outerCounter = 1;
        String outerStrNUM = strNUM.charAt(0) + "";
        for (int i = 0; i < strNUM.length(); i++) {
            int counter = 1;
            if ((i == strNUM.length() - 1) && (strNUM.length() > 1)) {
                if (strNUM.charAt(i) != strNUM.charAt(i - 1)) {
                    outerCounter = 1;
                }
                outerStrNUM = strNUM.charAt(i) + "";
            }
            for (int j = i + 1; j < strNUM.length(); j++) {
                if (strNUM.charAt(i) == strNUM.charAt(j)) {
                    counter++;
                    outerCounter = counter;
                    outerStrNUM = strNUM.charAt(i) + "";
                } else {
                    sb.append(counter).append(strNUM.charAt(i));
                    i = j - 1;
                    break;

                }
            }
        }
        sb.append(outerCounter).append(outerStrNUM);

        return Integer.parseInt(sb.toString());

    }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.LookSaySequence(s.nextLine()));
    System.out.print(c.LookSaySequence(1211));
  }   
  
}           
