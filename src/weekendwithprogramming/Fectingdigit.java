package weekendwithprogramming;

import java.util.Scanner;

public class Fectingdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int sum=0;
		while (num != 0) {
			int d = num % 10;
			sum=sum+d;
			num = num / 10;
		}
		System.out.println("sum of digits of this number is...."+sum);
	}
}
