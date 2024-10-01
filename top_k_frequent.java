import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * top_k_frequent
 */
//347. Top K Frequent Elements
class Pair{
    int first;
    int second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
    Pair()
    {
        
    }
}
public class top_k_frequent {
    
  public static void main(String[] args) {
    int[]arr = {1,1,1,3,3,2,3};
    int k = 2;
    System.out.println(Arrays.toString(topKFrequent(arr, k)));
  }
  public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i],1);
            }
            map.put(nums[i], map.get(nums[i])+1);
        }
        ArrayList<Pair> list = new ArrayList<>();
        for(int x : map.keySet()){
           list.add(new Pair(x , map.get(x)));
        }
        Collections.sort(list,(a,b)->{
            if(a.second==b.second)
            return a.first-b.first;
            else
            return b.second-a.second;
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i).first;
        }
        return arr;
  }
    
}
