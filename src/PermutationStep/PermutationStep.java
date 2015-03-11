package PermutationStep;
import java.util.*;

/*
Have the function PermutationStep(num) take the num parameter being passed and return 
the next number greater than num using the same digits. 
For example: if num is 123 return 132, if it's 12453 return 12534. 
If a number has no greater permutations, return -1 (ie. 999). 
*/
class Function {
    
    private final ArrayList<String> permList = new ArrayList<>();
    
    int PermutationStep(int num) {
        
        permute(Integer.toString(num));
        
        int nextGreatestDiff = (int) Double.POSITIVE_INFINITY;
        int nextGreatestNum = num;
        for (String n : permList) {
            int newNum = Integer.parseInt(n);
            int diff = newNum - num;
            if (diff > 0 && diff < nextGreatestDiff) {
                nextGreatestDiff = diff;
                nextGreatestNum = newNum;
            }
        }
        
        return nextGreatestNum != num ? nextGreatestNum : -1;
        
    }
    
    public void permute(String str) {
        permute("", str);
    }
    
    private void permute(String ltr, String str) {
        if (str.length() <= 1) {
            permList.add(ltr + str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String newStr = str.substring(0, i) + str.substring(i + 1);
                permute(ltr + str.charAt(i), newStr);
            }
        }
    }
    
    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.PermutationStep(s.nextLine()));
        System.out.print(c.PermutationStep(41352));
    }
    
}           
