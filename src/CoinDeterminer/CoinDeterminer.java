package CoinDeterminer;
import java.util.*; 

/*
Have the function CoinDeterminer(num) take the input, which will be an integer ranging from 1 to 250, 
and return an integer output that will specify the least number of coins, that when added, equal the input integer. 
Coins are based on a system as follows: there are coins representing the integers 1, 5, 7, 9, and 11. 
So for example: if num is 16, then the output should be 2 because you can achieve the number 16 
with the coins 9 and 7. If num is 25, then the output should be 3 because you can achieve 25 with either 11, 9, 
and 5 coins or with 9, 9, and 7 coins. 
*/
class Function {  
  int CoinDeterminer(int num) {

        int[] coins = new int[]{1, 5, 7, 9, 11};
        int[] Min = new int[num + 1];
        //System.out.println(Arrays.toString(Min));

        for (int i = 1; i <= num; i++) {
            Min[i] = (int) Double.POSITIVE_INFINITY;
            for (int j = 0; j < coins.length - 1; j++) {
                if (i - coins[j] >= 0) {
                    Min[i] = Math.min(Min[i], Min[i - coins[j]] + 1);
                }
            }
        }
        //System.out.println(Arrays.toString(Min));
        return Min[num];

    }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.CoinDeterminer(750)); 
  }   
  
}           
