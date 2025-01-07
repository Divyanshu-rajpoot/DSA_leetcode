import java.util.Arrays;

/**
 * sentance_similarity_3
 */
public class sentance_similarity_3 {

    public static void main(String[] args) {
       String sentence1 = "Luky";
       String sentence2 = "Lucccky";
       System.out.println(areSentencesSimilar(sentence1, sentence2));
    }

    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] arr = sentence1.split(" ");
        String[] arr2 = sentence2.split(" ");
        int p1 = 0;
        int p2 =0;
        while (p1 < arr.length && p2 < arr2.length) {
            if(arr[p1].equals(arr2[p2])){
                p1++;
                p2++;
                continue;
            }
            p1++;
        }
        if(p2 == arr2.length){
            return true;
        }
        return false;
    }
}