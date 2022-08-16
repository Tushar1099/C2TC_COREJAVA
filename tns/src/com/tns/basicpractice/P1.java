//55 ---> 10 ---> 1 or 96 ---> 15 ---> 6
package basicpractice;

public class P1 {
	public static void main(String[] args) {
		int n = 96;
		int sum = 0;
		while(n != 0 || sum > 9)
		{
			if(n == 0)
			{
				n = sum;
				sum = 0;
			}
			int d = n%10;
			sum = sum + d;
			n = n/10;
		}
		System.out.println(sum);
	}
}
