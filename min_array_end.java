import java.util.Arrays;

public class min_array_end {
    public static void main(String[] args) {
        int n = 6715154;
        int x = 7193485;        ;
        System.out.println(minEnd(n, x));
    }
    public static long minEnd(int n, int x) {
        if (n == 1) {
            return x;
        }
        String str = Integer.toBinaryString(x);
        str = String.format("%64s", Integer.toBinaryString(x)).replaceAll(" ", "0");
        long fans = 0;
        char arr[] = str.toCharArray();
        int val = n - 1;
        String temp = Integer.toBinaryString(val);
        int l = temp.length() - 1;
        for (int j = arr.length - 1; j >= 0; j--) {
            if (l < 0) {
                break;
            }
            if (arr[j] == '0') {
                arr[j] = temp.charAt(l);
                l--;
            }
        }
        String ans = new String(arr);
        long number = Long.parseLong(ans, 2);
        fans = number;
        return fans;
    }
    
}
