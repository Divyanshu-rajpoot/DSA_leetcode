/**
 * Binary_string_bit
 */
public class Binary_string_bit {

    public static void main(String[] args) {
        int[] arr = {2 , 8, 0};
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            str.append(String.format("%8s", Integer.toBinaryString(arr[i])).replace(" ", "0"));
        }
        str.reverse();
        System.out.println(Integer.parseInt(str.toString(),2));
        System.out.println(str);
    }
}