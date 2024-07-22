import java.util.Arrays;

/**
 * Sort_the_people
 * 2418. Sort the People
 */

 //2418. Sort the People
public class Sort_the_people {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[]heights = {180,165,170};
        //answer should be int he decensing order 
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
    public static  String[] sortPeople(String[] names, int[] heights) {
        
            for (int j = 0; j < names.length; j++) {
                int max = heights[j];
                int idx = j;
                for (int i = j+1; i < heights.length; i++) {
                    if(heights[i] > max){
                        max = heights[i];
                        idx = i;
                    }
                }
                //swap the values
                String temp = names[j];
                names[j] = names[idx];
                names[idx] = temp; 
            }
            return names;
    }

    
}