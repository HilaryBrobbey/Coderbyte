package StringReduction;
import java.util.*;


/**
 *
 * @author Hilary Brobbey
 */


class Function {

    int StringReduction(String str) {

        if (str.length() == 1) {
            return 1;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            //System.out.println(""+str.charAt(i)+str.charAt(i+1));
            if (str.charAt(i) != str.charAt(i + 1)) {
                String newStr = "";
                if (!str.substring(i, i + 2).contains("a")) {
                    newStr = "a";
                } else if (!str.substring(i, i + 2).contains("b")) {
                    newStr = "b";
                } else {
                    newStr = "c";
                }
                str = str.substring(0, i) + newStr + str.substring(i + 2);
                i = -1;
            }

        }

        //System.out.println(str);
        return str.length();

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.StringReduction(s.nextLine()));
    }

}           
