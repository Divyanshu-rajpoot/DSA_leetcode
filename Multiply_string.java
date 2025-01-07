import java.util.*;

public class Multiply_string {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1, num2));
    }
    public static String multiply(String num1, String num2) {
        StringBuilder num1str = new StringBuilder(num1);
        StringBuilder num2str = new StringBuilder(num2);
        num1str.reverse(); //reverse the strings
        num2str.reverse();  //reverse the strings
        return "";
    }
}
