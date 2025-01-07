import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_largest_element {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(arr, k));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        for(int i = 1;i<k;i++){
            pq.remove();
        }
        return pq.remove();
    }
}
