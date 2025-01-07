import java.util.*;

public class assign_cookies{
	public static void main(String[] args) {
		int[] greed = {1,5,3,3,4};
		int[] size = {4,2,1,2,1,3};
		System.out.println(cookies(greed , size));
	}
	public static int cookies(int[] greed , int[] size){
		int n = greed.length , m = size.length;
		int l = 0, r = 0;
		Arrays.sort(greed);
		Arrays.sort(size);
		while(l < m && r < n){
			if(greed[r] <= size[l]){
				r++;
			}
			l++;
		}
		return r;

	}

}