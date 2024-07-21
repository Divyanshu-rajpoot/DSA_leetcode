import java.util.Arrays;
import java.util.HashMap;

/**
 * string_compression
 * Leetcode Question 
 * 443. String Compression
 */
public class string_compression {
    public static void main(String[] args) {
        char[] str = {'a','a','a','b','b','a','a'};
        System.out.println(string_comp(str));
        //["a","3","b","2","a","2"] answer should be this 
    }
     public static int string_comp(char[] arr){
        int count = 1;
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                count++;
            }
            else{
                 ans.append(arr[i]);
                if(count == 1) continue;
                else  ans.append(count);
                count = 1;
            }
        }
        ans.append(arr[arr.length-1]);
        if(count != 1) ans.append(count);
        for (int i = 0; i < ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        return ans.length();
     }
}