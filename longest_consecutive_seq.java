import java.util.HashSet;

/**
 * longest_consecutive_seq
 */
public class longest_consecutive_seq {

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        int longest = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        for(Integer elem : set){
            if(!set.contains(elem - 1)){
                int cnt = 1;
                int newelem = elem;
                while(set.contains(newelem + 1)) {
                    cnt++;
                    newelem++;
                }
                longest =Math.max(cnt, longest);
            }
        }
        return longest;
    }
}