import java.util.HashSet;

public class CharDeletionCount {
    public static int minDeletions(String s) {
        //hold the count of specific chars in alphabet , a->0, b->1 ... z->25
        int[] charCount = new int[26];

        //number of deletions made to ensure unique char frequencies
        int deletionCount = 0;

        //update the char count
        for (char ch : s.toCharArray()){
            charCount[ch - 'a']++;
        }

        HashSet<Integer> frequency = new HashSet<>();

        for (int i = 0; i < charCount.length; i++){
            while(charCount[i] > 0 && frequency.contains(charCount[i])){
                charCount[i]--;
                deletionCount++;
            }
            frequency.add(charCount[i]);
        }

        return deletionCount;
    }

    public static void main(String[] args) {
        System.out.println(minDeletions("ceabaacb"));
    }
}
