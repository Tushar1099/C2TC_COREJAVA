//145 ---> 1 + 24 + 120 ---> 145 is a Strong number
package basicpractice;

public class StrongNumber {
	public static int factorial(int n)
	{
		int fact = 1;
		for(int i = 1; i <= n; i++)
		{
			fact = fact * i;
		}
		return fact;	
	}
	public static void main(String[] args) {
		int n = 146;
		int temp = n;
		int sum = 0;
		while(n != 0)
		{
			int d = n%10;
			sum = sum + factorial(d);
			n = n/10;
		}
		if(sum == temp)
		{
			System.out.println(temp + " is a Strong Number.");
		}
		else {
			System.out.println(temp + " is a thakela number.");
		}
	}
}
