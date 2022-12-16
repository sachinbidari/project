package weekendwithprogramming;

public class Demo {
	static int x = 10;

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.x = 30;
		Demo d2 = new Demo();
		d2.x = 50;
//		Demo d3 = new Demo();
//		d3.x = 45;

		System.out.println(d1.x);
		System.out.println(d2.x);
//		System.out.println(d3.x);
	}
}
