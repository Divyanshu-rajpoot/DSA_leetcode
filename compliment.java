public class compliment {

    public static void main(String[] args) {
        int num = 5;
        // int ans = 0;
        char[] s  = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < s.length; i++) {
            if(s[i] == '1') s[i] = '0';
            else s[i] = '1';
        }
        int ans = Integer.parseInt(String.valueOf(s) , 2);
        System.out.println(ans);
    }
}