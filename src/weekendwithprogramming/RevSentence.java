package weekendwithprogramming;

public class RevSentence {
	public static void main(String[] args) {
		String str = "hello java im mava";
		String ans = "";
		String[] arr = str.split(" ");
		String rev;
		for (int i = 0; i < arr.length; i++) {
			rev = "";
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				rev = rev + arr[i].charAt(j);
			}
			if (i < arr.length - 1)
				ans = ans + rev + " ";
			else
				ans = ans + rev;
		}
		System.out.println(ans);
	}
}
