import java.util.*;

public class largest_number {
    public static void main(String[] args) {
        int arr[] = {3,30,34,5,9};
        largestNumber(arr);
    }
    public static String largestNumber(int[] arr) {
        String str[] = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
            str[i] = Integer.toString(arr[i]);
        }
        Arrays.sort(str , (a,b)-> (b+a).compareTo(a+b) );
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<str.length;i++){
            ans.append(str[i]);
        }
        return ans.toString();
    }
}
