//19 ---> 1 + 9 = 10 and 1 * 9 = 9 --->10 + 9 = 19 is special number
package basicpractice;

public class SpecialNumber {

	public static void main(String[] args) {
		int n = 96;
		int temp = n;
		int sum = 0;
		int prod = 1;
		while(n != 0)
		{
			int d = n % 10;
			sum = sum + d;
			prod = prod * d;
			n = n/10;
		}
		int res = sum + prod;
		if(temp == res)
		{
			System.out.println(res + " is a special number.");
		}
		else
		{
			System.out.println(res + " is a faltu number.");
		}
	}

}
