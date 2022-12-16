package tyGrommm;

public class numofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2541;
		int count=0;
		int sum=0;
		while(num!=0)
		{
			int d=num%10;
			sum=sum+d;
			System.out.print(d+" ");
			num=num/10;
			count++;
			
		}
		System.out.println();
		System.out.println("Number of digits present in the number.."+count);
		System.out.println("sum of digits present in the number.."+sum);
	}

}
