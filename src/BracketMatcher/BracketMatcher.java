package BracketMatcher;
import java.util.*;

/*
Have the function BracketMatcher(str) take the str parameter being passed and return 1 
if the brackets are correctly matched and each one is accounted for. Otherwise return 0. 
For example: if str is "(hello (world))", then the output should be 1, but if str is "((hello (world))" 
the the output should be 0 because the brackets do not correctly match up. Only "(" and ")" will be used as brackets. 
If str contains no brackets return 1. 
*/
class Function {
    int BracketMatcher(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("(", 0);
        map.put(")", 0);
        if (!str.contains("(") && !str.contains(")")) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            if (("" + c).equals("(")) {
                map.put("(", map.get("(") + 1);
            }
            else if ((""+c).equals(")")){
                map.put(")", map.get(")") + 1 );
                if (map.get(")") > map.get("(")){ return 0;}      
        }
    }
        return map.get("(") == map.get(")") ? 1 : 0;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.BracketMatcher(("(hello (world))"))); 
  }   
  
}           
