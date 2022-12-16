package weekendwithprogramming;

public class Armstrong {
	public static void main(String[] args) {
		int num = 152;
		int copy = num;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum = sum + power(d, count(copy));
			num = num / 10;
		}
		if (sum == copy)
			System.out.println("Armstrong number...");
		else
			System.out.println("Not an Armstrong number...");
	}
	
	private static int power(int Base, int exp) {
		int ans = 1;
		while (exp != 0) {
			ans = ans * Base;
			exp--;
		}
		return ans;
	}

	private static int count(int copy) {
		int count = 0;
		while (copy != 0) {
			copy = copy / 10;
			count++;
		}
		return count;
	}
}
