import java.util.*;
/**
 * rank_transform
 */
public class rank_transform {

    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
        public static int[] arrayRankTransform(int[] arr) {
            int[] copy = new int[arr.length];
            for(int i = 0;i<arr.length;i++){
                copy[i] = arr[i];
            }
            Arrays.sort(copy);
            int[] ans = new int[arr.length];
            HashMap<Integer,Integer> map = new HashMap();
            int pos = 1;
            for(int i = 0;i<copy.length;i++){
                if(map.containsKey(copy[i])){
                    continue;
                }
                map.put(copy[i], pos);
                pos++;
            }
            for (int i = 0; i < arr.length; i++) {
                ans[i] = map.get(arr[i]);
            }
            return ans;
        }
}