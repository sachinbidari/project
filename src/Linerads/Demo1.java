package Linerads;
import java.util.Scanner;
public class Demo1 {
	static void generateEvenOdd(int no)
	{	
		for (int i = 1; i <=no; i++) {
			if(i%2!=0) {
			System.out.print(i+" ");
			}else {
				System.out.print((char)(67-i)+" ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no...");
		int no= sc.nextInt();
		generateEvenOdd(no);
	}
}
