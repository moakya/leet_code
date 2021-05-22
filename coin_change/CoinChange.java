public class CoinChange {
  public static int coinChange(int[] coins, int amount) {
    if (amount <= 0){
      return 0;
    }
    return coinRecurse(coins, amount, new int[amount + 1]);
  }

  public static int coinRecurse(int[] coins, int amount, int[] coinCount){

    //base case for end of subtree
    if (amount == 0){
      return 0;
    }

    //base case for impossible solution
    if (amount < 0){
      return -1;
    }

    //case for ensuring that sub tree is visited
    if(coinCount[amount] != 0){
      return coinCount[amount];
    }

    //assumption about min value
    int min = Integer.MAX_VALUE;

    for(int coin : coins){
      int result = coinRecurse(coins, amount - coin, coinCount);

      //ensuring that new min is a possible solution
      if (result >= 0 && result < min){
        //adding 1 for a coin that is used
        min = result + 1;
      }
    }

    //ensure that min is updated in the state array
    if (min != Integer.MAX_VALUE){
      coinCount[amount] = min;
    }
    else{
      coinCount[amount] = -1;
    }

    return coinCount[amount];
  }

  public static void main(String[] args) {
    System.out.println(coinChange(new int[] {1,2,5}, 11));
  }
}