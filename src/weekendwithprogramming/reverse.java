package weekendwithprogramming;

public class reverse {
	public static void main(String[] args) {
		int num = 101;
		int copy = num;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum = sum * 10 + d;
			num = num / 10;
		}

		if (sum == copy)
			System.out.println("palindrome number");
		else
			System.out.println("its not a palindrome number");
	}
}
