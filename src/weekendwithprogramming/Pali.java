package weekendwithprogramming;

public class Pali {
	public static void main(String[] args) {
		int no = 12321;
		int num = no;
		while (num > 9) {
			num = palindrome(num);
		}
		System.out.println(num);
	}

	static int palindrome(int no) {
		int copy = no;
		int rev = 0;
		while (no != 0) {
			int rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;
		}
		if (copy == rev) {
//       	System.out.println(rev);
			sum(rev);
		}
		return rev;
	}

	static int sum(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		return sum;
	}
}
