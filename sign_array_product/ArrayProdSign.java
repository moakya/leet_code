public class ArrayProdSign {
    public static int arraySign(int[] nums){
      int result = 1;
      for(int i : nums){
        if(i == 0)
          return 0;
        if (i < 0)
          result *= -1;
      }
      return result;
    }
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6};
      System.out.println(arraySign(arr));
    }
}
