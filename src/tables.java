import java.util.Scanner;

public class tables {
	static void Tab(int n)
	{
		
		for (int i = 1; i <=10; i++) {
			System.out.println(n+"*"+i+"="+n*i);
			
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number...");
		int a=sc.nextInt();
		Tab(a);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number...");
	int a=sc.nextInt();
	Tab(a);
}
}
