package basicpractice;

public class P2 {
	static int a = 10;
	public static void main(String[] args) {
		int a = 20;
		P2 p = new P2();
		System.out.println(a);
		System.out.println(P2.a);
		System.out.println(p.a);
	}
}
