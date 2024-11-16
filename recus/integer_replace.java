package recus;

public class integer_replace {
    public static void main(String[] args) {
        int num = 15;
        int[] arr = new int[num+1];
        System.out.println(replace(num,arr));
    }
    //simple resusive solution but gives tle in larger test cases
    public static int replace(int num , int[] arr){
        if(num == 1){
            return 0;
        }
        
        if(num % 2 ==0){
            return 1+replace(num/2);
        }
        return 1+Math.min(replace(num+1) , replace(num-1));
    }
}
