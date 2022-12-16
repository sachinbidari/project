package weekendwithprogramming;

public class Fibinocci {

	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		System.out.print(f1 + " " + f2 + " ");
		for (int i = 1; i <= 8; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3 + " ");
		}

	}

}
