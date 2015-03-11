package MultipleBrackets;
import java.util.*;


/**
 *
 * @author Hilary Brobbey
 * Have the function MultipleBrackets(str) take the str parameter being passed and return 1 #ofBrackets 
 * if the brackets are correctly matched and each one is accounted for. Otherwise return 0. 
 * For example: if str is "(hello [world])(!)", then the output should be 1 3 because all the brackets are 
 * matched and there are 3 pairs of brackets, but if str is "((hello [world])" the the output should be 0 
 * because the brackets do not correctly match up. Only "(", ")", "[", and "]" will be used as brackets. 
 * If str contains no brackets return 1. 
 */


class Function {

    String MultipleBrackets(String str) {
        
        if (!str.contains("(") && !str.contains(")")
                && !str.contains("[")&& !str.contains("]")){
            return "1";
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("(", 0);
        map.put(")", 0);
        map.put("[", 0);
        map.put("]", 0);

        for (char c : str.toCharArray()) {
            if (("" + c).equals("(") || ("" + c).equals("[")) {
                map.put("" + c, map.get("" + c) + 1);
            } else if (("" + c).equals(")") || ("" + c).equals("]")) {
                map.put("" + c, map.get("" + c) + 1);
                if (map.get(")") > map.get("(")) {
                    return "0";
                }
                if (map.get("]") > map.get("[")) {
                    return "0";
                }
            }
        }
        if (map.get("(") == map.get(")")
                && map.get("[") == map.get("]")) {

            return "1 " + Integer.toString(map.get("(") + map.get("["));

        }

        return "0";
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.MultipleBrackets(s.nextLine()));
    }

}           
