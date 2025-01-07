import java.util.Arrays;

/**
 * no_of_pairs_divisbleby_k
 */
public class no_of_pairs_divisbleby_k {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
        int k = 5;
        int[] freq = new int[arr.length];
        for (int i = 0; i < freq.length; i++) {
            freq[((arr[i] % k) + k) % k]++;
        }
        System.out.println(Arrays.toString(freq));
        if(freq[0] % 2 != 0){
            System.out.println(false);
        }
        for (int i = 1; i < k/2; i++) {
            if(freq[i] != freq[k-i]){
                System.out.println(false);
            }
        }
    }
}