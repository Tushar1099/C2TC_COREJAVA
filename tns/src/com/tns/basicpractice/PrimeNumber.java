package basicpractice;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 5;
		if(n == 0 || n == 1)
		{
			System.out.println("Neither Prime nor Composite.");
			return;
		}
		for(int i = 2; i < n; i++)
		{
			if(n%i == 0)
			{
				System.out.println(n + " is not a prime number.");
				return;
			}
		}
		System.out.println(n + " is a prime number.");
	}
}
