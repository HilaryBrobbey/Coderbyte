package MeanMode;

import java.util.*;

/**
 *
 * @author Hilary Brobbey Have the function MeanMode(arr) take the array of
 * numbers stored in arr and return 1 if the mode equals the mean, 0 if they
 * don't equal each other (ie. [5, 3, 3, 3, 1] should return 1 because the mode
 * (3) equals the mean (3)). The array will not be empty, will only contain
 * positive integers, and will not contain more than one mode.
 */
class Function {

    int MeanMode(int[] arr) {

        HashMap<Integer, Integer> intCount = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (!intCount.containsKey(arr[i])) {
                intCount.put(arr[i], 1);
            } else {
                intCount.put(arr[i], intCount.get(arr[i]) + 1);
            }
        }
        int mean = sum / arr.length;
        //System.out.println(mean);

        int highestFrequency = -1;
        int mode = -1;
        for (int k : intCount.keySet()) {
            if (intCount.get(k) > highestFrequency) {
                highestFrequency = intCount.get(k);
                mode = k;
            }
        }

        //System.out.println(mode);
        //System.out.println(intCount.toString());
        return mode == mean ? 1 : 0;

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.MeanMode(s.nextLine())); 
        System.out.print(c.MeanMode(new int[]{5, 3, 3, 3, 1}));
    }

}
