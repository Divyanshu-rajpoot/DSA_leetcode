import java.util.Arrays;

/**
 * sum_inthe_matrix
 */
//Sum in a Matrix 2679
public class sum_inthe_matrix {
    public static void main(String[] args) {
        int[][] arr = {
            {7,2,1},
            {6,4,2},
            {6,5,3},
            {3,2,1}
        };
        // System.out.println(matrixSum(arr));
        // Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
           System.out.println(Arrays.toString(arr[i]));
        }
        // System.out.println(arr);
        System.out.println(matrixSum(arr));
    }
    public static int matrixSum(int[][] arr) {
        
        int ans = 0;
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = arr.length-1; j >= 0 ; j--) {
                sum = Math.max(sum , arr[j][i]);
                
            }
            ans += sum;
        }
        return ans;
    }
    
}