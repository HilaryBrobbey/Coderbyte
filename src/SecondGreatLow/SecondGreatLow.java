package SecondGreatLow;

import java.util.*;

/**
 *
 * @author Hilary Brobbey Have the function SecondGreatLow(arr) take the array
 * of numbers stored in arr and return the second lowest and second greatest
 * numbers, respectively, separated by a space. For example: if arr contains [7,
 * 7, 12, 98, 106] the output should be 12 98. The array will not be empty and
 * will contain at least 2 numbers. It can get tricky if there's just two
 * numbers!
 */
class Function {

    String SecondGreatLow(int[] arr) {

        HashMap<Integer, Integer> removeRepeats = new HashMap<>();
        for (int i : arr) {
            if (!removeRepeats.containsKey(i)) {
                removeRepeats.put(i, null);
            }
        }

        List<Integer> newArrList = new ArrayList<>();
        for (int k : removeRepeats.keySet()) {
            newArrList.add(k);
        }

        Integer[] newArr = newArrList.toArray(new Integer[newArrList.size()]);
        Arrays.sort(newArr);
        return newArr[1] + " " + newArr[newArr.length - 2];

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.SecondGreatLow(s.nextLine())); 
        System.out.print(c.SecondGreatLow(new int[]{7, 7, 12, 98, 106}));
    }

}
