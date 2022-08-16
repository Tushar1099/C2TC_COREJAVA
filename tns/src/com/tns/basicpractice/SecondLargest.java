package basicpractice;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a = {6,5,6,4,5,3,1};
		int large = a[0];
		int slarge = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > large) {
				slarge = large;
				large = a[i];
			}
			else if (a[i] > slarge && large > a[i]) {
				slarge = a[i];
			}
		}
		System.out.println(slarge);
		System.out.println(large);
	}
}
