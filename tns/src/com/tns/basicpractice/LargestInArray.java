package basicpractice;

public class LargestInArray {
	public static void main(String[] args) {
		int [] a = {1,5,4,7,8,3,9,10,2};
		int large = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i] > large)
			{
				large = a[i];
			}
		}
		System.out.println(large);
		int largest = large;
		for (int j = 0; j < a.length; j++) {
			if (a[j] > largest) {
				large = a[j];
			}
		}
		System.out.println(large);
	}
}
