import java.util.*;
class Factorial 
{
	public static void main(String[] args) 
	{
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int i=sc.nextInt();
		for(;i>1;i--)
		{
			f=f*i;
		}
		System.out.println("factorial = "+f);

	}
}
