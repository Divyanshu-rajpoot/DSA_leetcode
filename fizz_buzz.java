import java.util.ArrayList;
import java.util.List;

public class fizz_buzz {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fizzBuzz(num));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> str = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i%3 == 0){
                if(i%5 == 0){
                    str.add("FizzBuzz");
                }
                else{
                    str.add("Fizz");
                }
            }
            else if(i%5 ==0){
                str.add("Buzz");
            }
            else{
                str.add(Integer.toString(i));
            }
        }

        return str;
    }
}
