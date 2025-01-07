import java.util.Arrays;

/**
 * seive_of_erathosethenes
 */
public class seive_of_erathosethenes {

    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        int[] primes = new int[n+1];
        Arrays.fill(primes, 2, primes.length, 1);
        for(int i = 2;i*i<n;i++){
            if (primes[i] == 1) {
                for (int j = i*i; j <= n; j+=i) {
                    primes[j] = 0;
                }
            }
        }
        for (int i = 0; i < primes.length; i++) {
            if(primes[i] == 1) count++;
        }
        System.out.println(count);
        System.out.println(Arrays.toString(primes));
    }
}