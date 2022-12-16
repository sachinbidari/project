package weekendwithprogramming;
import java.util.Arrays;
public class arrrr {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int element[] = { 11, 12, 10 };
		int y = 0;
		int index = 5;
		int x = 0;
		int res[] = new int[arr.length + element.length];
		for (int i = 0; i < res.length; i++) {
			if (i >= index && i < index + element.length) {
				res[i] = element[y];
				y++;
			} else {
				res[i] = arr[x];
				x++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
