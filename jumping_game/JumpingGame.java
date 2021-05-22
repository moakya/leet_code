public class JumpingGame {

    public static Boolean recurse(int[] arr, int size, int curIndex, int count){
        if (curIndex < 0 || curIndex >= size || count > size){
            return false;
        }
        else if (arr[curIndex] == 0){
            return true;
        }
        else{
            return recurse(arr, size, curIndex + arr[curIndex], count+1) || recurse(arr, size, curIndex - arr[curIndex], count+1);
        }
    }

    public static Boolean canReach(int[] arr, int start){
        //make sure 0 is part of the array
        Boolean validArray = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                validArray = true;
            }
        }

        if (validArray){
            return recurse(arr, arr.length, start, 0);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(canReach(
            new int[]{ 4, 2, 0, 3, 3, 1, 2 }, 5));
    }
}