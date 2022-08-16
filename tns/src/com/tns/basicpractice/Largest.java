package basicpractice;

public class Largest {
	public static void main(String[] args) {
		int[] a = {6,3,5,4,6,2,1};
		int large = a[0];
		int slarge = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > large) {
				slarge = large;
				large = a[i];
			}
		}
		System.out.println("Largest " +large);
		System.out.println("2nd largest " +slarge);
	}
}
