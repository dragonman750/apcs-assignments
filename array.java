
public class array {
	public static void main(String[] args) {
		int a[] = { 10, 20, 70, 40, 50, 60 };
		int b[] = { 20, 30, 80, 50, 60, 70 };
		int y = a[0];
		a[0] = b[0];

		b[0] = y;
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < a.length; i++) {
			System.out.println(b[i]);
		}
	}
}