import java.util.Arrays;
public class rowboat {

	public static void main(String[] args) {
	int[] arr = { 1, 2, 3 };
	int x = 5;System.out.println("Array before method: "+Arrays.toString(arr));System.out.println("Int before method: "+x);

changeFirst(arr, x);
System.out.println("Array after method: " + Arrays.toString(arr));
System.out.println("Int after method: " + x);
	}
	public static void changeFirst(int[] a, int x) {
		a[0] = x;
		x = 1;
	}
}
