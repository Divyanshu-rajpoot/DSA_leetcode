/**
 * jump_game1
 */
//55. Jump Game
public class jump_game1 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums) {
        //using greeady approach
        int target = nums.length-1;
        for(int i = nums.length-1 ; i>=0 ;i--){
            if(i + nums[i] >= target){
                target = i;
            }
        }
        return target == 0;
    }
    
}