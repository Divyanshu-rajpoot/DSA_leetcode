import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class ugly_number2 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(nthUglyNumber(number));
    }
    public static int nthUglyNumber(int n) {
        List<Integer> list = new ArrayList();
        int cnt2 = n/2;
        int cnt3 = n/3;
        int cnt5 = n/5;
        list.add(1);
        while (cnt2-- > 1) {
            list.add(2*cnt2);
        }
        while (cnt3-- > 1) {
            int val = 3*cnt3;
            if(list.contains(val)){
                
            }
            list.add(val);
            
        }
        while (cnt5-- > 1) {
            list.add(5*cnt5);
        }
        System.out.println(list);
        return 0;
    }
}
