import java.util.ArrayList;
import java.util.List;

/**
 * permutation
 */
public class permutation {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        System.out.println(permutation(arr, ans, 0));
    }
    public static List<List<Integer>> permutation(int[] nums , List<List<Integer>> ans ,int itr){
        if (itr>nums.length) {
            return ans;
        }
        List<Integer> list = new ArrayList<>();
        list.add(nums[itr]);
        permutation(nums, ans, itr+1);
        ans.add(list);
        return ans ;
    }
}