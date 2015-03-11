package ThirdGreatest;

import java.util.*;

/**
 *
 * @author Hilary Brobbey Have the function ThirdGreatest(strArr) take the array
 * of strings stored in strArr and return the third largest word within in. So
 * for example: if strArr is ["hello", "world", "before", "all"] your output
 * should be world because "before" is 6 letters long, and "hello" and "world"
 * are both 5, but the output should be world because it appeared as the last 5
 * letter word in the array. If strArr was ["hello", "world", "after", "all"]
 * the output should be after because the first three words are all 5 letters
 * long, so return the last one. The array will have at least three strings and
 * each string will only contain letters.
 */
class Function {

    String ThirdGreatest(String[] strArr) {

        int[] lens = new int[strArr.length];
        int index = 0;
        for (String word : strArr) {
            lens[index] = word.length();
            index++;
        }
        Arrays.sort(lens);

        int third = lens[lens.length - 3];

        for (int i = strArr.length - 1; i >= 0; i--) {
            if (strArr[i].length() == third) {
                return strArr[i];
            }
        }
        return "";
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.ThirdGreatest(s.nextLine())); 
        System.out.print(c.ThirdGreatest(new String[]{"hello", "world", "before", "all"}));
    }

}
