/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArithGeoII;

/**
 *
 * @author Hilary Brobbey
 * Have the function ArithGeoII(arr) take the array of numbers stored in arr and return the string "Arithmetic" 
 * if the sequence follows an arithmetic pattern or return "Geometric" if it follows a geometric pattern. 
 * If the sequence doesn't follow either pattern return -1. An arithmetic sequence is one where the 
 * difference between each of the numbers is consistent, where as in a geometric sequence, 
 * each term after the first is multiplied by some constant or common ratio. 
 * Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. 
 * Negative numbers may be entered as parameters, 0 will not be entered, and no array will contain all the same elements. 

 */
import java.util.*; 
import java.io.*;

class Function {  
  String ArithGeoII(int[] arr) { 
  
   if (arr.length < 2) {
            return "-1";
        }
        
        List<Integer> difference = new ArrayList<>();
        List<Float> quotient = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            float q = arr[i + 1] / arr[i];
            quotient.add(q);
            difference.add(arr[i + 1] - arr[i]);
        }
        boolean arithmenticFlag = true;
        int previous = difference.get(0);
        for (int i = 1; i < difference.size(); i++) {
            if (difference.get(i) != previous) {
                arithmenticFlag = false;
                break;
            }
        }
        boolean geometricFlag = true;
        float first = quotient.get(0);
        for (int i = 1; i < quotient.size(); i++) {
            if (quotient.get(i) != first) {
                geometricFlag = false;
                break;
            }
        }
        if (arithmenticFlag) {
            return "Arithmetic";
        }
        if (geometricFlag) {
            return "Geometric";
        }
        return "-1";
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    //System.out.print(c.ArithGeoII(s.nextLine())); 
    System.out.print(c.ArithGeoII(new int[]{2,4,6,18})); 
  }   
  
}           
