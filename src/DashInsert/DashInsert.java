package DashInsert;
import java.util.*;


/**
 *
 * @author Hilary Brobbey
 * Have the function DashInsert(str) insert dashes ('-') 
 * between each two odd numbers in str. For example: if str is 454793 the output should be 4547-9-3. Don't count zero as an odd number. 
 */


class Function {

    String DashInsert(int num) {

        StringBuilder sb = new StringBuilder();
        String strNum = Integer.toString(num);
        String acc = "" + strNum.charAt(0);

        for (int i = 1; i < strNum.length(); i++) {
            if (Integer.parseInt(acc) % 2 != 0
                    && Integer.parseInt(strNum.substring(i, i + 1)) % 2 != 0) {
                sb.append(acc);
                sb.append("-");
                acc = strNum.substring(i, i + 1);
                //sb.append(strNum.substring(i, i+1));
            } else {
                acc += strNum.substring(i, i + 1);
            }
        }

        sb.append(acc);

        return sb.toString();

    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        //System.out.print(c.DashInsert(s.nextLine()));
        System.out.print(c.DashInsert(56730));
    }

}           
