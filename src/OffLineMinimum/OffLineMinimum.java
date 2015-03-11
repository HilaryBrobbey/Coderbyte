package OffLineMinimum;
import java.util.*;

/**
 *
 * @author Hilary Brobbey
 * Have the function OffLineMinimum(strArr) take the strArr parameter being passed which 
 * will be an array of integers ranging from 1...n and the letter "E" and return the correct subset based 
 * on the following rules. The input will be in the following format: ["I","I","E","I",...,"E",...,"I"] 
 * where the I's stand for integers and the E means take out the smallest integer currently in the whole set. 
 * When finished, your program should return that new set with integers separated by commas. 
 * For example: if strArr is ["5","4","6","E","1","7","E","E","3","2"] then your program should return 4,1,5. 
 */

class Function {
    String OffLineMinimum(String[] strArr) {
        
        //System.out.println(Arrays.toString(strArr));

        StringBuilder sb = new StringBuilder();

        int smallest = (int) Double.POSITIVE_INFINITY;
        int idxSmallest = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null) {
                if (!strArr[i].equals("E")) {
                    int n = Integer.parseInt(strArr[i]);
                    if (n < smallest) {
                        smallest = n;
                        idxSmallest = i;
                    }
                } else { //"E"
                    sb.append(smallest);
                    sb.append(",");
                    strArr[i] = null;
                    strArr[idxSmallest] = null;
                    smallest = (int) Double.POSITIVE_INFINITY;
                    i = -1;
                    idxSmallest = 0;
                }
            }
            
            //System.out.println(Arrays.toString(strArr));   
            //System.out.println(smallest);
            //System.out.println(idxSmallest);
            //System.out.println(i);
                   
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.OffLineMinimum(s.nextLine()));
        System.out.print(c.OffLineMinimum(new String[]{"5", "4", "6", "E", "1", "7", "E", "E", "3", "2"}));
    }

}           
