import java.util.Arrays;

public class Maxiumum_product {
    public static void main(String[] args) {
        int[] arr = {1,5,4,5};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        //more method can be to find the two maximum number
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max1){
                int tem = max1;
                max1 = nums[i];
                if(max2 < tem) max2 = tem;
            }
            else if(max2<nums[i]){
                max2 = nums[i];
            }
        }
        System.out.println(max1 +" " + max2);
        return (max1-1 )* (max2-1);
    }
}
