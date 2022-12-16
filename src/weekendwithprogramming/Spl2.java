package weekendwithprogramming;
import java.util.Scanner;
public class Spl2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		int d1 = x % 10;
		int d2 = x / 10;
		int res = d1 + d2 + d1 * d2;
		if (res == x)
			System.out.println(x + " is a special two digit number");
		else
			System.out.println(x + "  is not a special two digit number");
	}
}
